package com.funtl.oauth2.service.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Desription:
 *
 * @ClassName PasswordEncoderTest
 * @Author Zhanyuwei
 * @Date 2019/11/16 23:14
 * @Version 1.0
 **/
public class PasswordEncoderTest {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
