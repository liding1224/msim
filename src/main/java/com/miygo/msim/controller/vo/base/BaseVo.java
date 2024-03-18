package com.miygo.msim.controller.vo.base;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BaseVo {
    private UUID createdBy;

    private Date createdDate;

    private UUID lastUpdatedBy;

    private Date lastUpdatedDate;
}
