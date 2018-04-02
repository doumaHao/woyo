package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.PasserDetail;
import cn.douma.woyo.db.entity.PasserDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasserDetailMapper {
    int countByExample(PasserDetailExample example);

    int deleteByExample(PasserDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PasserDetail record);

    int insertSelective(PasserDetail record);

    List<PasserDetail> selectByExample(PasserDetailExample example);

    PasserDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PasserDetail record, @Param("example") PasserDetailExample example);

    int updateByExample(@Param("record") PasserDetail record, @Param("example") PasserDetailExample example);

    int updateByPrimaryKeySelective(PasserDetail record);

    int updateByPrimaryKey(PasserDetail record);
}