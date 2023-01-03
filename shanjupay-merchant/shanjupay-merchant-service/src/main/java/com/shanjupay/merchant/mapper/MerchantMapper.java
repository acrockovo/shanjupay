package com.shanjupay.merchant.mapper;


import com.shanjupay.merchant.api.dto.MerchantDTO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
public interface MerchantMapper {
    MerchantDTO selectById(@Param("id") Long id);
}
