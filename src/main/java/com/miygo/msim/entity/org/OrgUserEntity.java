package com.miygo.msim.entity.org;

import com.miygo.msim.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class OrgUserEntity extends BaseEntity {
    private UUID id;

    private String name;

    private String loginId;

    private String password;

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
}
