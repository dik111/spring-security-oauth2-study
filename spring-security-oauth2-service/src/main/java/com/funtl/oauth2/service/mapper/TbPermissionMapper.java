package com.funtl.oauth2.service.mapper;

import com.funtl.oauth2.service.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId( @Param("userId") Long userId);
}