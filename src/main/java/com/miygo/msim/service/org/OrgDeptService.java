package com.miygo.msim.service.org;

import com.miygo.msim.entity.org.OrgDeptEntity;
import com.miygo.msim.mapper.org.OrgDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrgDeptService {
    @Autowired
    private OrgDeptMapper orgDeptMapper;

    public List<OrgDeptEntity> queryDeptList(UUID orgId, String deptName){
        return orgDeptMapper.queryDeptList(orgId, deptName);
    }
}
