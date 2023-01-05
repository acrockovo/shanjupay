package com.shanjupay.merchant.service;

import com.shanjupay.merchant.api.SmsService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.time.Duration;

/**
 * @author lyc
 * @date 2023-01-04
 * 验证码服务
 */
@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private StringRedisTemplate redisTemplate;
    /**
     * 根据手机号发送验证码
     * @param phone 手机号
     * @return 验证码
     */
    @Override
    public String sendSmsCode(String phone) {

        String smsCode = "123456";

        // 存入redis中
        redisTemplate.opsForValue().set("sms_code:" + phone, smsCode, Duration.ofMinutes(5));

        return smsCode;
    }
}
