package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.DriverShareInfo;
import cn.douma.woyo.db.entity.DriverShareInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverShareInfoMapper {
    int countByExample(DriverShareInfoExample example);

    int deleteByExample(DriverShareInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DriverShareInfo record);

    int insertSelective(DriverShareInfo record);

    List<DriverShareInfo> selectByExample(DriverShareInfoExample example);

    DriverShareInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DriverShareInfo record, @Param("example") DriverShareInfoExample example);

    int updateByExample(@Param("record") DriverShareInfo record, @Param("example") DriverShareInfoExample example);

    int updateByPrimaryKeySelective(DriverShareInfo record);

    int updateByPrimaryKey(DriverShareInfo record);
}