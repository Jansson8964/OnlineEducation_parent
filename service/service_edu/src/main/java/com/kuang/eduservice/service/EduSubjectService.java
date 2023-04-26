package com.kuang.eduservice.service;

import com.kuang.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kuang.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface EduSubjectService extends IService<EduSubject> {

    //添加课程分类
    void saveSubject(MultipartFile file,EduSubjectService subjectService);

    List<OneSubject> getAllOneTwoSubject();
}
