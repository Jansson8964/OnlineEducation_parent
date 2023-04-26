package com.kuang.eduservice.mapper;

import com.kuang.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


public interface EduTeacherMapper extends BaseMapper<EduTeacher> {

    /**
     * 更新审核
     * @param eduTeacher
     * @return
     */
    boolean updateAudit(EduTeacher eduTeacher);
}
