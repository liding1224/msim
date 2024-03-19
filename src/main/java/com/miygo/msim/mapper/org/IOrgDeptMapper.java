package com.miygo.msim.mapper.org;

import com.miygo.msim.entity.org.OrgDeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IOrgDeptMapper {
    List<OrgDeptEntity> queryDeptList(@Param("orgId") String orgId, @Param("deptName") String deptName);
}
