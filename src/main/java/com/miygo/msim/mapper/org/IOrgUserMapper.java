package com.miygo.msim.mapper.org;

import com.miygo.msim.entity.org.OrgUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IOrgUserMapper {
    List<OrgUserEntity> queryUserList(@Param("orgId") String orgId, @Param("userId") String userId, @Param("userName")  String userName);
}
