package com.shanjupay.merchant.entity;


import java.io.Serializable;
import lombok.Data;

@Data
public class StoreStaff implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 门店标识
     */
    private Long storeId;

    /**
     * 员工标识
     */
    private Long staffId;


}
