package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.RequirementInfo;
import cn.douma.woyo.db.entity.RequirementInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequirementInfoMapper {
    int countByExample(RequirementInfoExample example);

    int deleteByExample(RequirementInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RequirementInfo record);

    int insertSelective(RequirementInfo record);

    List<RequirementInfo> selectByExample(RequirementInfoExample example);

    RequirementInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RequirementInfo record, @Param("example") RequirementInfoExample example);

    int updateByExample(@Param("record") RequirementInfo record, @Param("example") RequirementInfoExample example);

    int updateByPrimaryKeySelective(RequirementInfo record);

    int updateByPrimaryKey(RequirementInfo record);
}