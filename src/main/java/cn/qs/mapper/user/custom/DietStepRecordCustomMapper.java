package cn.qs.mapper.user.custom;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DietStepRecordCustomMapper {
	@Select(value = "SELECT username,fullname,stepnumber FROM USER LEFT JOIN diet_step_record ON user.username = diet_step_record.creatorusername AND diet_step_record.remark = #{day} ORDER BY stepnumber desc")
	List<Map<String, Object>> getStepSequence(@Param("day") String day);
}