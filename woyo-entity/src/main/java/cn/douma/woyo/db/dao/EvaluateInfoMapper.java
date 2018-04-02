package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.EvaluateInfo;
import cn.douma.woyo.db.entity.EvaluateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluateInfoMapper {
    int countByExample(EvaluateInfoExample example);

    int deleteByExample(EvaluateInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EvaluateInfo record);

    int insertSelective(EvaluateInfo record);

    List<EvaluateInfo> selectByExample(EvaluateInfoExample example);

    EvaluateInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EvaluateInfo record, @Param("example") EvaluateInfoExample example);

    int updateByExample(@Param("record") EvaluateInfo record, @Param("example") EvaluateInfoExample example);

    int updateByPrimaryKeySelective(EvaluateInfo record);

    int updateByPrimaryKey(EvaluateInfo record);
}