package cn.douma.woyo.db.dao;

import cn.douma.woyo.db.entity.PasserOrder;
import cn.douma.woyo.db.entity.PasserOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasserOrderMapper {
    int countByExample(PasserOrderExample example);

    int deleteByExample(PasserOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PasserOrder record);

    int insertSelective(PasserOrder record);

    List<PasserOrder> selectByExample(PasserOrderExample example);

    PasserOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PasserOrder record, @Param("example") PasserOrderExample example);

    int updateByExample(@Param("record") PasserOrder record, @Param("example") PasserOrderExample example);

    int updateByPrimaryKeySelective(PasserOrder record);

    int updateByPrimaryKey(PasserOrder record);
}