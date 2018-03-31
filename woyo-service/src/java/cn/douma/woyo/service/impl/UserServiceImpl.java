package cn.douma.woyo.service.impl;

import cn.douma.woyo.constant.SexEnum;
import cn.douma.woyo.constant.UserRegTypeEnum;
import cn.douma.woyo.constant.UserStatusEnum;
import cn.douma.woyo.core.UserManager;
import cn.douma.woyo.db.dao.UserInfoMapper;
import cn.douma.woyo.db.entity.UserInfo;
import cn.douma.woyo.db.entity.UserInfoExample;
import cn.douma.woyo.exception.CheckException;
import cn.douma.woyo.service.UserService;
import cn.douma.woyo.util.DateUtil;
import cn.douma.woyo.util.ListUtil;
import cn.douma.woyo.util.MD5Util;
import cn.douma.woyo.vo.LoginUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2017-11-13
 * Time: 20:49
 */
@SuppressWarnings("ALL")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo register(String regMethod, UserInfo userInfo) {
        if ("pc".equals(regMethod)) {
            return registerByPc(userInfo);
        } else if ("app".equals(regMethod)) {
            return registerByApp(userInfo);
        } else if ("weixin".equals(regMethod)) {
            return registerByWeixin(userInfo);
        } else {
            throw new CheckException("注册方式异常");
        }
    }

    @Override
    public UserInfo registerByWeixin(UserInfo userInfo) {
        return register(userInfo, UserRegTypeEnum.TYPE_01.getCode());
    }

    @Override
    public UserInfo registerByPc(UserInfo userInfo) {
        return register(userInfo, UserRegTypeEnum.TYPE_02.getCode());
    }

    @Override
    public UserInfo registerByApp(UserInfo userInfo) {
        return register(userInfo, UserRegTypeEnum.TYPE_03.getCode());
    }

    private UserInfo register(UserInfo userInfo, String regType) {
        String name = userInfo.getName();
        String idno = userInfo.getIdno();
        String telphone = userInfo.getTelphone();
        String login = userInfo.getLogin();
        String password = userInfo.getPassword();
        if (StringUtils.isEmpty(name)
                || StringUtils.isEmpty(idno)
                || StringUtils.isEmpty(telphone)
                || StringUtils.isEmpty(login)
                || StringUtils.isEmpty(password)) {
            throw new CheckException("注册时,姓名、身份证号、手机号、登录名和密码均不能为空");
        }
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria()
                .andIdnoEqualTo(idno);
        userInfoExample.or().andTelphoneEqualTo(telphone);
        userInfoExample.or().andLoginEqualTo(login);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        if (ListUtil.isNotEmpty(userInfoList)) {
            throw new CheckException("登录名、身份证号和手机号均不能重复");
        }
        //密码MD5化
        userInfo.setPassword(MD5Util.MD5(password));
        //性别
        userInfo.setSex(getSexForIdno(idno));
        //生日
//        userInfo.setBirthday(this.getBrithdayForIdno(idno));
        //用户评分
        userInfo.setScore(this.getUserScoreForReg(userInfo));
        //注册方式
        userInfo.setRegType(regType);
        //注册时间
        userInfo.setRegTime(DateUtil.getSysNow());
        //登录次数
        userInfo.setLoginTimes(0);
        //状态
        userInfo.setState(UserStatusEnum.TYPE_1.getCode());
        userInfoMapper.insert(userInfo);
        return userInfo;
    }

    @Override
    public LoginUserVo loginByPassword(String login, String password) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria()
                .andLoginEqualTo(login);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        if (ListUtil.isNotEmpty(userInfoList)) {
            UserInfo userInfo = userInfoList.get(0);
            String pswd = userInfoList.get(0).getPassword();
            if (pswd.equals(MD5Util.MD5(password))) {
                LoginUserVo loginUserVo = new LoginUserVo();
                loginUserVo.setUserInfo(userInfo);
                UserManager.getInstance().addSysUser(loginUserVo);
                return loginUserVo;
            }
        }
        return null;
    }

    @Override
    public boolean userLogout() {
        UserManager.getInstance().removeSysUser();
        return true;
    }

    /**
     * 根据身份证号获取性别
     *
     * @param idno
     * @return
     */
    private String getSexForIdno(String idno) {
        int sex = Integer.valueOf(idno.substring(16, 17));
        if (sex % 2 == 0) {
            return SexEnum.WOMAN.getCode();
        } else {
            return SexEnum.MAN.getCode();
        }
    }

    /**
     * 根据身份证号获取生日
     *
     * @param idno
     * @return
     */
    private String getBrithdayForIdno(String idno) {
        return idno.substring(10, 14);
    }

    /**
     * 根据初始客户注册信息获取客户初始分数
     *
     * @param userInfo
     */
    private int getUserScoreForReg(UserInfo userInfo) {
        int score = 70;
        if (!StringUtils.isEmpty(userInfo.getNativePlace())) {
            score += 5;
        }
        if (!StringUtils.isEmpty(userInfo.getQq())
                || !StringUtils.isEmpty(userInfo.getWechar())) {
            score += 5;
        }
        if (!StringUtils.isEmpty(userInfo.getMail())) {
            score += 5;
        }
        return score;
    }

}
