package com.kuang.aclservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kuang.aclservice.entity.Permission;

import java.util.List;

/**
 * <p>
 * 权限 Mapper 接口
 * </p>
 *
 * @author YangSong
 * @since 2022-01-12
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<String> selectPermissionValueByUserId(String id);

    List<String> selectAllPermissionValue();

    List<Permission> selectPermissionByUserId(String userId);
}
