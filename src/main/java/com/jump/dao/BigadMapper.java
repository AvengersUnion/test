package com.jump.dao;

import com.jump.pojo.Bigad;
import com.jump.pojo.BigadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BigadMapper {
    int countByExample(BigadExample example);

    int deleteByExample(BigadExample example);

    int deleteByPrimaryKey(Integer bigadId);

    int insert(Bigad record);

    int insertSelective(Bigad record);

    List<Bigad> selectByExample(BigadExample example);

    Bigad selectByPrimaryKey(Integer bigadId);

    int updateByExampleSelective(@Param("record") Bigad record, @Param("example") BigadExample example);

    int updateByExample(@Param("record") Bigad record, @Param("example") BigadExample example);

    int updateByPrimaryKeySelective(Bigad record);

    int updateByPrimaryKey(Bigad record);
}