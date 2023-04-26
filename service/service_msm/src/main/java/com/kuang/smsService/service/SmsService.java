package com.kuang.smsService.service;

import java.util.Map;


public interface SmsService {
    boolean sendEmail(String verCode, String email);
}
