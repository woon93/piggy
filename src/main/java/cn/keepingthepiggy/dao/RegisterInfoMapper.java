package cn.keepingthepiggy.dao;

import cn.keepingthepiggy.dataModel.RegisterInfoExample;
import cn.keepingthepiggy.dataModel.RegisterInfo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RegisterInfoMapper {
    int countByExample(RegisterInfoExample example);

    int deleteByExample(RegisterInfoExample example);

    int insert(RegisterInfo record);

    int insertSelective(RegisterInfo record);

    List<RegisterInfo> selectByExample(RegisterInfoExample example);

    int updateByExampleSelective(@Param("record") RegisterInfo record, @Param("example") RegisterInfoExample example);

    int updateByExample(@Param("record") RegisterInfo record, @Param("example") RegisterInfoExample example);
}