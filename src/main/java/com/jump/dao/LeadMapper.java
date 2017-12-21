package com.jump.dao;

import com.jump.pojo.Lead;
import com.jump.pojo.LeadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeadMapper {
    int countByExample(LeadExample example);

    int deleteByExample(LeadExample example);

    int deleteByPrimaryKey(Integer leadId);

    int insert(Lead record);

    int insertSelective(Lead record);

    List<Lead> selectByExample(LeadExample example);

    Lead selectByPrimaryKey(Integer leadId);

    int updateByExampleSelective(@Param("record") Lead record, @Param("example") LeadExample example);

    int updateByExample(@Param("record") Lead record, @Param("example") LeadExample example);

    int updateByPrimaryKeySelective(Lead record);

    int updateByPrimaryKey(Lead record);
}