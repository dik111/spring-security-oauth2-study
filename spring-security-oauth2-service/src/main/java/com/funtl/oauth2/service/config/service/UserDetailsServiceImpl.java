package com.funtl.oauth2.service.config.service;

import com.funtl.oauth2.service.domain.TbPermission;
import com.funtl.oauth2.service.domain.TbUser;
import com.funtl.oauth2.service.service.TbPermissionService;
import com.funtl.oauth2.service.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desription:
 *
 * @ClassName UserDetailsServiceImpl
 * @Author Zhanyuwei
 * @Date 2019/11/17 15:23
 * @Version 1.0
 **/

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getByUserName(username);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();

        if (tbUser != null){
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());
            tbPermissions.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority =new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorities.add(grantedAuthority);
            });
        }

        return new  User(tbUser.getUsername(),tbUser.getPassword(),grantedAuthorities);
    }
}
