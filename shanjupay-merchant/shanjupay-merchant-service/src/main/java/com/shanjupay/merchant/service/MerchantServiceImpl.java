package com.shanjupay.merchant.service;

import com.shanjupay.merchant.api.MerchantService;
import com.shanjupay.merchant.api.dto.MerchantDTO;
import com.shanjupay.merchant.entity.Merchant;
import com.shanjupay.merchant.mapper.MerchantMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator.
 */
@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    /**
     * 根据id查询
     * @param id 商户id
     * @return
     */
    @Override
    public MerchantDTO queryMerchantById(Long id) {

        return merchantMapper.selectById(id);
    }

    /**
     * 新增商户
     * @param merchantDTO 商户对象
     * @return
     */
    @Override
    public MerchantDTO insertMerchant(MerchantDTO merchantDTO) {
        

        return null;
    }
}
