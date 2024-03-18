package com.miygo.msim.entity;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BaseEntity {
    private UUID createdBy;

    private Date createdDate;

    private UUID lastUpdatedBy;

    private Date lastUpdatedDate;
}
