package com.miygo.msim.mapper.org;

import com.miygo.msim.entity.org.OrgUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.UUID;

@Mapper
public interface OrgUserMapper {
    List<OrgUserEntity> queryUserList(@Param("orgId") UUID orgId, @Param("userId") UUID userId, @Param("userName")  String userName);
}
