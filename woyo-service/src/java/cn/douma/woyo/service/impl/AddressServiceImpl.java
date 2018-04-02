package cn.douma.woyo.service.impl;

import cn.douma.woyo.db.dao.UserAddressMapper;
import cn.douma.woyo.db.entity.UserAddress;
import cn.douma.woyo.db.entity.UserAddressExample;
import cn.douma.woyo.exception.CheckException;
import cn.douma.woyo.service.AddressService;
import cn.douma.woyo.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-28
 * Time: 17:58
 */
@SuppressWarnings("ALL")
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public UserAddress add(String idno, UserAddress userAddress) {
        String provinceId = userAddress.getProvinceId();
        String cityId = userAddress.getCityId();
        String areaId = userAddress.getAreaId();
        if (StringUtils.isBlank(idno)
                || StringUtils.isBlank(provinceId)
                || StringUtil.isBlank(cityId)
                || StringUtil.isBlank(areaId)) {
            throw new CheckException("身份证编号、省市区id不能为空");
        }
        userAddress.setIdno(idno);
        userAddressMapper.insert(userAddress);
        return userAddress;
    }

    @Override
    public List<UserAddress> listForIdno(String idno) {
        if (StringUtils.isBlank(idno)) {
            throw new CheckException("idno不能为空");
        }
        UserAddressExample userAddressExample = new UserAddressExample();
        userAddressExample.createCriteria()
                .andIdnoEqualTo(idno);
        return userAddressMapper.selectByExample(userAddressExample);
    }

    @Override
    public List<UserAddress> listForIdno(String idno, int count) {
        if (StringUtils.isBlank(idno)) {
            throw new CheckException("idno不能为空");
        }
        UserAddressExample userAddressExample = new UserAddressExample();
        userAddressExample.createCriteria()
                .andIdnoEqualTo(idno);
        userAddressExample.setOrderByClause("last_use_date desc limit " + count);
        return userAddressMapper.selectByExample(userAddressExample);
    }
}
