package com.funtl.oauth2.service.service;


import com.funtl.oauth2.service.domain.TbUser;

public interface TbUserService {

    TbUser getByUserName(String username);
}
