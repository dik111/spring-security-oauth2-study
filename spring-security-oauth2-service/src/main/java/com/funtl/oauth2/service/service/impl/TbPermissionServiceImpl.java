package com.funtl.oauth2.service.service.impl;

import com.funtl.oauth2.service.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.funtl.oauth2.service.mapper.TbPermissionMapper;
import com.funtl.oauth2.service.service.TbPermissionService;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
