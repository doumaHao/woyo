package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.ProvincialCity;
import cn.douma.woyo.db.entity.ProvincialCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProvincialCityMapper {
    int countByExample(ProvincialCityExample example);

    int deleteByExample(ProvincialCityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProvincialCity record);

    int insertSelective(ProvincialCity record);

    List<ProvincialCity> selectByExample(ProvincialCityExample example);

    ProvincialCity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProvincialCity record, @Param("example") ProvincialCityExample example);

    int updateByExample(@Param("record") ProvincialCity record, @Param("example") ProvincialCityExample example);

    int updateByPrimaryKeySelective(ProvincialCity record);

    int updateByPrimaryKey(ProvincialCity record);
}