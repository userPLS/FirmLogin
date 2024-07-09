package org.example.login.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.login.pojo.Positions;
import org.example.login.pojo.PositionsExample;

public interface PositionsMapper {
    long countByExample(PositionsExample example);

    int deleteByExample(PositionsExample example);

    int deleteByPrimaryKey(Integer positionid);

    int insert(Positions record);

    int insertSelective(Positions record);

    List<Positions> selectByExample(PositionsExample example);

    Positions selectByPrimaryKey(Integer positionid);

    int updateByExampleSelective(@Param("record") Positions record, @Param("example") PositionsExample example);

    int updateByExample(@Param("record") Positions record, @Param("example") PositionsExample example);

    int updateByPrimaryKeySelective(Positions record);

    int updateByPrimaryKey(Positions record);
}