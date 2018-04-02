package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.PasserShareInfo;
import cn.douma.woyo.db.entity.PasserShareInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasserShareInfoMapper {
    int countByExample(PasserShareInfoExample example);

    int deleteByExample(PasserShareInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PasserShareInfo record);

    int insertSelective(PasserShareInfo record);

    List<PasserShareInfo> selectByExample(PasserShareInfoExample example);

    PasserShareInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PasserShareInfo record, @Param("example") PasserShareInfoExample example);

    int updateByExample(@Param("record") PasserShareInfo record, @Param("example") PasserShareInfoExample example);

    int updateByPrimaryKeySelective(PasserShareInfo record);

    int updateByPrimaryKey(PasserShareInfo record);
}