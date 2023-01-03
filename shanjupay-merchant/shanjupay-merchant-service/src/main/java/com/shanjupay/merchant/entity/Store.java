package com.shanjupay.merchant.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 门店编号
     */
    private Long storeNumber;

    /**
     * 所属商户
     */
    private Long merchantId;

    /**
     * 父门店
     */
    private Long parentId;

    /**
     * 0表示禁用，1表示启用
     */
    private Boolean storeStatus;

    /**
     * 门店地址
     */
    private String storeAddress;


}
