package com.kuang.eduservice.service;

import com.kuang.eduservice.entity.EduVideo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface EduVideoService extends IService<EduVideo> {

    void removeVideoByCourseId(String courseId);

}
