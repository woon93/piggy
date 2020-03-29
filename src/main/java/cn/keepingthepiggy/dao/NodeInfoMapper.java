package cn.keepingthepiggy.dao;

import cn.keepingthepiggy.dataModel.NodeInfo;
import cn.keepingthepiggy.dataModel.NodeInfoExample;
import cn.keepingthepiggy.dataModel.NodeInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeInfoMapper {
    int countByExample(NodeInfoExample example);

    int deleteByExample(NodeInfoExample example);

    int insert(NodeInfoWithBLOBs record);

    int insertSelective(NodeInfoWithBLOBs record);

    List<NodeInfoWithBLOBs> selectByExampleWithBLOBs(NodeInfoExample example);

    List<NodeInfo> selectByExample(NodeInfoExample example);

    int updateByExampleSelective(@Param("record") NodeInfoWithBLOBs record, @Param("example") NodeInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") NodeInfoWithBLOBs record, @Param("example") NodeInfoExample example);

    int updateByExample(@Param("record") NodeInfo record, @Param("example") NodeInfoExample example);
}