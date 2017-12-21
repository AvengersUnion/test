package com.jump.dao;

import com.jump.pojo.Description;
import com.jump.pojo.DescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DescriptionMapper {
    int countByExample(DescriptionExample example);

    int deleteByExample(DescriptionExample example);

    int deleteByPrimaryKey(Long decId);

    int insert(Description record);

    int insertSelective(Description record);

    List<Description> selectByExampleWithBLOBs(DescriptionExample example);

    List<Description> selectByExample(DescriptionExample example);

    Description selectByPrimaryKey(Long decId);

    int updateByExampleSelective(@Param("record") Description record, @Param("example") DescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") Description record, @Param("example") DescriptionExample example);

    int updateByExample(@Param("record") Description record, @Param("example") DescriptionExample example);

    int updateByPrimaryKeySelective(Description record);

    int updateByPrimaryKeyWithBLOBs(Description record);
}