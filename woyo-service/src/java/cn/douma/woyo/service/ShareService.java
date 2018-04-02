package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.DriverShareInfo;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2017. douma.cn, All Rights Reserved
 * Description:
 * User: douma haoxijun
 * Date: 2018-03-28
 * Time: 17:55
 */
@Service
public interface ShareService {

    /**
     * 增加车找人信息
     * @param idno
     * @param carNo
     * @param driverShareInfo
     * @return
     */
    DriverShareInfo shareDriverInfo(String idno, String carNo, DriverShareInfo driverShareInfo);

    /**
     * 客户退票-增加剩余座位数
     * 客户订票-减少剩余座位数
     * @param id
     * @param count
     * @return
     */
    DriverShareInfo shareDriverInfo(Long id, int count);

}
