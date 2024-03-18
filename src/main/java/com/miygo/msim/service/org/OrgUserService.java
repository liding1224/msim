package com.miygo.msim.service.org;

import com.miygo.msim.entity.org.OrgUserEntity;
import com.miygo.msim.mapper.org.OrgUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrgUserService {
    @Autowired
    private OrgUserMapper orgUserMapper;

    public List<OrgUserEntity> queryUserList(UUID orgId, UUID userId, String userName){
        return orgUserMapper.queryUserList(orgId, userId, userName);
    }
}
