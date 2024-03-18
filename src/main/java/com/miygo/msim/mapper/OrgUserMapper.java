package com.miygo.msim.mapper;

import com.miygo.msim.entity.OrgUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrgUserMapper {
    List<OrgUserEntity> queryUserList(@Param("orgId") String orgId, @Param("userId") String userId, @Param("userName")  String userName);
}
