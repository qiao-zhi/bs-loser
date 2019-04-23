package cn.qs.mapper.common;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.qs.bean.common.LosePlan;
import cn.qs.bean.common.LosePlanExample;

@Mapper
public interface LosePlanMapper {
	int countByExample(LosePlanExample example);

	int deleteByExample(LosePlanExample example);

	int deleteByPrimaryKey(String id);

	int insert(LosePlan record);

	int insertSelective(LosePlan record);

	List<LosePlan> selectByExample(LosePlanExample example);

	LosePlan selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") LosePlan record, @Param("example") LosePlanExample example);

	int updateByExample(@Param("record") LosePlan record, @Param("example") LosePlanExample example);

	int updateByPrimaryKeySelective(LosePlan record);

	int updateByPrimaryKey(LosePlan record);
}