package com.shanjupay.merchant.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;

@Data
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商户ID
     */
    private Long merchantId;

    /**
     * 姓名
     */
    private String fullName;

    /**
     * 职位
     */
    private String position;

    /**
     * 用户名(关联统一用户)
     */
    private String username;

    /**
     * 手机号(关联统一用户)
     */
    private String mobile;

    /**
     * 员工所属门店
     */
    private Long storeId;

    /**
     * 最后一次登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 0表示禁用，1表示启用
     */
    private Boolean staffStatus;


}
