package com.funtl.oauth2.service.service.impl;

import com.funtl.oauth2.service.domain.TbUser;
import com.funtl.oauth2.service.mapper.TbUserMapper;
import com.funtl.oauth2.service.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getByUserName(String username) {

        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username",username);
        return tbUserMapper.selectOneByExample(example);
    }
}
