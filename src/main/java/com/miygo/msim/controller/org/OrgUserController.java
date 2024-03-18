package com.miygo.msim.controller.org;

import com.miygo.msim.controller.vo.BaseResponse;
import com.miygo.msim.controller.vo.OrgUserVo;
import com.miygo.msim.entity.org.OrgUserEntity;
import com.miygo.msim.service.org.OrgUserService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class OrgUserController {
    @Autowired
    private OrgUserService orgUserService;

    @GetMapping("/org/user")
    public BaseResponse<List<OrgUserVo>> queryUserList(UUID orgId, UUID userId, String userName){
        BaseResponse<List<OrgUserVo>> successResult = BaseResponse.getSuccessResult(BaseResponse.class);
        List<OrgUserEntity> orgUserEntities = orgUserService.queryUserList(orgId, userId, userName);
        List<OrgUserVo> orgUserVos = orgUserEntities.stream().map(OrgUserVo::transferEntityToVo).collect(Collectors.toList());
        successResult.setData(orgUserVos);
        return successResult;
    }






































}
