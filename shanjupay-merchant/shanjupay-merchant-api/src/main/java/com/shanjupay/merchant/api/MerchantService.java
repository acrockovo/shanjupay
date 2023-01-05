package com.shanjupay.merchant.api;

import com.shanjupay.merchant.api.dto.MerchantDTO;

/**
 * Created by Administrator.
 */
public interface MerchantService {

    // 根据id查询商户
    MerchantDTO queryMerchantById(Long id);

    // 商户注册
    MerchantDTO insertMerchant(MerchantDTO merchantDTO);
}
