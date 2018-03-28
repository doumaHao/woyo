package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.DriverSharingInfo;
import cn.douma.woyo.db.entity.DriverSharingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverSharingInfoMapper {
    int countByExample(DriverSharingInfoExample example);

    int deleteByExample(DriverSharingInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DriverSharingInfo record);

    int insertSelective(DriverSharingInfo record);

    List<DriverSharingInfo> selectByExample(DriverSharingInfoExample example);

    DriverSharingInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DriverSharingInfo record, @Param("example") DriverSharingInfoExample example);

    int updateByExample(@Param("record") DriverSharingInfo record, @Param("example") DriverSharingInfoExample example);

    int updateByPrimaryKeySelective(DriverSharingInfo record);

    int updateByPrimaryKey(DriverSharingInfo record);
}