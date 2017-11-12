package cn.douma.woyo.service.impl;

import cn.douma.woyo.db.dao.UserInfoMapper;
import cn.douma.woyo.db.entity.UserInfo;
import cn.douma.woyo.db.entity.UserInfoExample;
import cn.douma.woyo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> list() {
        UserInfoExample userInfoExample = new UserInfoExample();
        return userInfoMapper.selectByExample(userInfoExample);
    }
}
