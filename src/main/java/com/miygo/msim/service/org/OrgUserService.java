package com.miygo.msim.service.org;

import com.miygo.msim.entity.org.OrgUserEntity;
import com.miygo.msim.mapper.org.IOrgUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgUserService {
    @Autowired
    private IOrgUserMapper orgUserMapper;

    public List<OrgUserEntity> queryUserList(String orgId, String userId, String userName){
        return orgUserMapper.queryUserList(orgId, userId, userName);
    }
}