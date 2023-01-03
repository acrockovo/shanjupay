package com.shanjupay.merchant.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class App implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String appId;

    /**
     * 商店名称
     */
    private String appName;

    /**
     * 所属商户
     */
    private Long merchantId;

    /**
     * 应用公钥(RSAWithSHA256)
     */
    private String publicKey;

    /**
     * 授权回调地址
     */
    private String notifyUrl;


}
