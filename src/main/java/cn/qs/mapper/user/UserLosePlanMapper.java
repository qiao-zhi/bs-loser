package cn.qs.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.qs.bean.user.UserLosePlan;
import cn.qs.bean.user.UserLosePlanExample;
@Mapper
public interface UserLosePlanMapper {
    int countByExample(UserLosePlanExample example);

    int deleteByExample(UserLosePlanExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserLosePlan record);

    int insertSelective(UserLosePlan record);

    List<UserLosePlan> selectByExample(UserLosePlanExample example);

    UserLosePlan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserLosePlan record, @Param("example") UserLosePlanExample example);

    int updateByExample(@Param("record") UserLosePlan record, @Param("example") UserLosePlanExample example);

    int updateByPrimaryKeySelective(UserLosePlan record);

    int updateByPrimaryKey(UserLosePlan record);
}