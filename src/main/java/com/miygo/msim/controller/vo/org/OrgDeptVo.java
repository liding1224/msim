package com.miygo.msim.controller.vo.org;

import com.miygo.msim.controller.vo.BaseVo;
import com.miygo.msim.entity.org.OrgDeptEntity;
import lombok.Data;

@Data
public class OrgDeptVo extends BaseVo {
    private String id;
    private String parent;
    private String name;
    private String code;
    private int level;
    private int order;
    private String deptFullName;
    private int icode;
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
        vo.setIcode(orgDeptEntity.getIcode());
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
