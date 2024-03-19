package com.miygo.msim.entity.org;

import com.miygo.msim.entity.BaseEntity;
import lombok.Data;

@Data
public class OrgDeptEntity extends BaseEntity {
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
}
