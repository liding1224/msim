package com.miygo.msim.service;

import com.miygo.msim.entity.OrgUserEntity;
import com.miygo.msim.mapper.OrgUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgUserService {
    @Autowired
    private OrgUserMapper orgUserMapper;

    public List<OrgUserEntity> queryUserList(String orgId, String userId, String userName){
        return orgUserMapper.queryUserList(orgId, userId, userName);
    }
}