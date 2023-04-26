package com.kuang.eduservice.mapper;

import com.kuang.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kuang.eduservice.entity.frontVo.CourseWebVo;
import com.kuang.eduservice.entity.vo.CoursePublishVo;


public interface EduCourseMapper extends BaseMapper<EduCourse> {

    public CoursePublishVo getPublicCourseInfo(String courseId);

    CourseWebVo getBaseCourseInfo(String courseId);
}
