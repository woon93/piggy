package cn.keepingthepiggy.dao;

import cn.keepingthepiggy.dataModel.UrzInfo;
import cn.keepingthepiggy.dataModel.UrzInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UrzInfoMapper {
    int countByExample(UrzInfoExample example);

    int deleteByExample(UrzInfoExample example);

    int insert(UrzInfo record);

    int insertSelective(UrzInfo record);

    List<UrzInfo> selectByExampleWithBLOBs(UrzInfoExample example);

    List<UrzInfo> selectByExample(UrzInfoExample example);

    int updateByExampleSelective(@Param("record") UrzInfo record, @Param("example") UrzInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") UrzInfo record, @Param("example") UrzInfoExample example);

    int updateByExample(@Param("record") UrzInfo record, @Param("example") UrzInfoExample example);
}