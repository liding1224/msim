package com.miygo.msim.entity.org;

import com.miygo.msim.entity.base.BaseEntity;
import lombok.Data;

import java.util.UUID;

@Data
public class OrgDeptEntity extends BaseEntity {
    private UUID id;

    private UUID parent;

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
