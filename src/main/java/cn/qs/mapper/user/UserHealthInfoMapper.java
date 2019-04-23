package cn.qs.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.qs.bean.user.UserHealthInfo;
import cn.qs.bean.user.UserHealthInfoExample;
@Mapper
public interface UserHealthInfoMapper {
    int countByExample(UserHealthInfoExample example);

    int deleteByExample(UserHealthInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserHealthInfo record);

    int insertSelective(UserHealthInfo record);

    List<UserHealthInfo> selectByExample(UserHealthInfoExample example);

    UserHealthInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserHealthInfo record, @Param("example") UserHealthInfoExample example);

    int updateByExample(@Param("record") UserHealthInfo record, @Param("example") UserHealthInfoExample example);

    int updateByPrimaryKeySelective(UserHealthInfo record);

    int updateByPrimaryKey(UserHealthInfo record);
}