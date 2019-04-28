package cn.qs.mapper.user;

import cn.qs.bean.user.DietStepRecord;
import cn.qs.bean.user.DietStepRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DietStepRecordMapper {
    int countByExample(DietStepRecordExample example);

    int deleteByExample(DietStepRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DietStepRecord record);

    int insertSelective(DietStepRecord record);

    List<DietStepRecord> selectByExample(DietStepRecordExample example);

    DietStepRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DietStepRecord record, @Param("example") DietStepRecordExample example);

    int updateByExample(@Param("record") DietStepRecord record, @Param("example") DietStepRecordExample example);

    int updateByPrimaryKeySelective(DietStepRecord record);

    int updateByPrimaryKey(DietStepRecord record);
}