package com.kuang.smsService.controller;

import com.kuang.common.utils.R;
import com.kuang.smsService.service.SmsService;
import com.kuang.smsService.utils.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/edusms/sms")
//@CrossOrigin
public class SmsController {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Autowired
    private SmsService smsService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate; //redis模板

    @GetMapping("sendEmail/{email}")
    public R sendEmail(@PathVariable String email) {
        //从redis中获取验证码，如果获取到直接返回
        String verCode = redisTemplate.opsForValue().get(email);
        if (!StringUtils.isEmpty(verCode)) {
            return R.ok();
        }

        verCode = RandomUtil.getSixBitRandom();

        boolean wasSend = smsService.sendEmail(verCode, email);
        if (wasSend) {
            redisTemplate.opsForValue().set(email, verCode, 5, TimeUnit.MINUTES);
            return R.ok();
        }
        return R.error().message("邮件发送失败");
    }
}