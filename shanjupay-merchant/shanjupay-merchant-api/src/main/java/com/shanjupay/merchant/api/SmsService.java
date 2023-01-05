package com.shanjupay.merchant.api;

public interface SmsService {

    // 根据手机号发送验证码
    String sendSmsCode(String phone);
}
