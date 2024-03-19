package com.miygo.msim.controller.org;

import com.miygo.msim.controller.vo.BaseResponse;
import com.miygo.msim.controller.vo.org.OrgDeptVo;
import com.miygo.msim.entity.org.OrgDeptEntity;
import com.miygo.msim.service.org.OrgDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class OrgDeptController {
    @Autowired
    private OrgDeptService orgDeptService;

    @GetMapping("/org/dept")
    public BaseResponse<List<OrgDeptVo>> queryDeptList(String orgId, String deptName){
        BaseResponse<List<OrgDeptVo>> successResult = BaseResponse.getSuccessResult(BaseResponse.class);
        List<OrgDeptEntity> orgDeptEntities = orgDeptService.queryDeptList(orgId, deptName);
        List<OrgDeptVo> orgDeptVos = orgDeptEntities.stream().map(OrgDeptVo::transferEntityToVo).collect(Collectors.toList());
        successResult.setData(orgDeptVos);
        return successResult;
    }
}
