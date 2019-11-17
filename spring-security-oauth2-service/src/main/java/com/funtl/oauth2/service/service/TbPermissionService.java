package com.funtl.oauth2.service.service;

import com.funtl.oauth2.service.domain.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionService{

    List<TbPermission> selectByUserId(Long userId);
}
