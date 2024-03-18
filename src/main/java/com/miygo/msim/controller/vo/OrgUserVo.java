package com.miygo.msim.controller.vo;

import com.miygo.msim.controller.vo.base.BaseVo;
import com.miygo.msim.entity.org.OrgUserEntity;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class OrgUserVo extends BaseVo {
    private UUID id;

    private String name;

    private String loginId;

    private String email;

    private String mobilePhone;

    private String im;

    private String telPhone;

    private int sex;

    private Date birthday;

    private UUID orgId;

    private int order;

    private Date lastLoginDate;

    private int enabled;

    public static OrgUserVo transferEntityToVo(OrgUserEntity orgUserEntity){
        OrgUserVo vo = new OrgUserVo();
        vo.setId(orgUserEntity.getId());
        vo.setName(orgUserEntity.getName());
        vo.setLoginId(orgUserEntity.getLoginId());
        vo.setEmail(orgUserEntity.getEmail());
        vo.setMobilePhone(orgUserEntity.getMobilePhone());
        vo.setIm(orgUserEntity.getIm());
        vo.setTelPhone(orgUserEntity.getTelPhone());
        vo.setSex(orgUserEntity.getSex());
        vo.setBirthday(orgUserEntity.getBirthday());
        vo.setOrgId(orgUserEntity.getOrgId());
        vo.setOrder(orgUserEntity.getOrder());
        vo.setLastLoginDate(orgUserEntity.getLastLoginDate());
        vo.setEnabled(orgUserEntity.getEnabled());
        vo.setCreatedBy(orgUserEntity.getCreatedBy());
        vo.setCreatedDate(orgUserEntity.getCreatedDate());
        vo.setLastUpdatedBy(orgUserEntity.getLastUpdatedBy());
        vo.setLastUpdatedDate(orgUserEntity.getLastUpdatedDate());
        return vo;
    }
}
