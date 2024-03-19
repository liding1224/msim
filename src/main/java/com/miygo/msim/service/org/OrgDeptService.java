package com.miygo.msim.service.org;

import com.miygo.msim.entity.org.OrgDeptEntity;
import com.miygo.msim.mapper.org.IOrgDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgDeptService {
    @Autowired
    private IOrgDeptMapper orgDeptMapper;

    public List<OrgDeptEntity> queryDeptList(String orgId, String orgName){
        return orgDeptMapper.queryDeptList(orgId, orgName);
    }
}
