package com.kuang.oss.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {
    //上传头像到oss中
    String uploadFileAvator(MultipartFile file);
}