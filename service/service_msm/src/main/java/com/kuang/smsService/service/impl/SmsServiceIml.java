package com.kuang.smsService.service.impl;

import com.kuang.smsService.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SmsServiceIml implements SmsService {

//    @Override
//    public boolean send(Map<String, Object> param, String phone) {
//
//        if(StringUtils.isEmpty(phone)) return false;
//
//        DefaultProfile profile =
//                DefaultProfile.getProfile(
//                        ConstantPropertiesUtils.REGION_Id,
//                        ConstantPropertiesUtils.ACCESS_KEY_ID,
//                        ConstantPropertiesUtils.SECRECT
//                );
//        IAcsClient client = new DefaultAcsClient(profile);
//
//        //设置相关固定的参数
//        CommonRequest request = new CommonRequest();
//        //request.setProtocol(ProtocolType.HTTPS);
//        request.setMethod(MethodType.POST);
//        request.setDomain("dysmsapi.aliyuncs.com");
//        request.setVersion("2017-05-25");
//        request.setAction("SendSms");
//
//        //设置发送相关的参数
//        request.putQueryParameter("PhoneNumbers",phone); //手机号
//        request.putQueryParameter("SignName","我的xmall购物商城"); //申请阿里云 签名名称
//        request.putQueryParameter("TemplateCode","SMS_205121391"); //申请阿里云 模板code
//        request.putQueryParameter("TemplateParam", JSONObject.toJSONString(param)); //验证码数据，转换json数据传递
//
//        try {
//            //最终发送
//            CommonResponse response = client.getCommonResponse(request);
//            boolean success = response.getHttpResponse().isSuccess();
//            return success;
//        }catch(Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
    @Autowired
    private JavaMailSenderImpl mailSender;
    @Override
    public boolean sendEmail(String verCode, String email) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("3088474946@qq.com");
        // 接收人邮箱
        message.setTo(email);
        message.setSubject("[品葱学院]");
        message.setText("您好:\n"
                + "\n本次请求的邮件验证码为:" + verCode + ",本验证码 5 分钟内效，请及时输入。（请勿泄露此验证码）\n"
                + "\n如非本人操作，请忽略该邮件。\n(这是一封通过自动发送的邮件，请不要直接回复）");
        try {
            mailSender.send(message);
            return true;
        } catch (MailException e) {
            e.printStackTrace();
        }
        return false;
    }

    }


