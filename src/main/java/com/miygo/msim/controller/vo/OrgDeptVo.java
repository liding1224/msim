package com.miygo.msim.controller.vo;

import com.miygo.msim.controller.vo.base.BaseVo;
import com.miygo.msim.entity.org.OrgDeptEntity;
import lombok.Data;

import java.util.UUID;

@Data
public class OrgDeptVo extends BaseVo {
    private UUID id;

    private UUID parent;

    private String name;

    private String code;

    private int level;

    private int order;

    private String deptFullName;

    private int enabled;

    private int orgType;

    private String telPhone;

    private String contactName;

    public static OrgDeptVo transferEntityToVo(OrgDeptEntity orgDeptEntity){
        OrgDeptVo vo = new OrgDeptVo();
        vo.setId(orgDeptEntity.getId());
        vo.setParent(orgDeptEntity.getParent());
        vo.setName(orgDeptEntity.getName());
        vo.setCode(orgDeptEntity.getCode());
        vo.setLevel(orgDeptEntity.getLevel());
        vo.setOrder(orgDeptEntity.getOrder());
        vo.setDeptFullName(orgDeptEntity.getDeptFullName());
        vo.setEnabled(orgDeptEntity.getEnabled());
        vo.setOrgType(orgDeptEntity.getOrgType());
        vo.setTelPhone(orgDeptEntity.getTelPhone());
        vo.setContactName(orgDeptEntity.getContactName());
        vo.setCreatedBy(orgDeptEntity.getCreatedBy());
        vo.setCreatedDate(orgDeptEntity.getCreatedDate());
        vo.setLastUpdatedBy(orgDeptEntity.getLastUpdatedBy());
        vo.setLastUpdatedDate(orgDeptEntity.getLastUpdatedDate());
        return vo;
    }
}
