package com.kuang.educenter.mapper;

import com.kuang.educenter.entity.UcenterMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author YangSong
 * @since 2022-10-25
 */
public interface UcenterMemberMapper extends BaseMapper<UcenterMember> {

    //查询某一天注册人数
    Integer countRegisterDay(String day);
}
