package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.DriverOrder;
import cn.douma.woyo.db.entity.DriverOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverOrderMapper {
    int countByExample(DriverOrderExample example);

    int deleteByExample(DriverOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DriverOrder record);

    int insertSelective(DriverOrder record);

    List<DriverOrder> selectByExample(DriverOrderExample example);

    DriverOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DriverOrder record, @Param("example") DriverOrderExample example);

    int updateByExample(@Param("record") DriverOrder record, @Param("example") DriverOrderExample example);

    int updateByPrimaryKeySelective(DriverOrder record);

    int updateByPrimaryKey(DriverOrder record);
}