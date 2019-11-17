package com.funtl.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Desription:
 *
 * @ClassName Oauth2ResourceApplication
 * @Author Zhanyuwei
 * @Date 2019/11/17 16:29
 * @Version 1.0
 **/

@SpringBootApplication
@MapperScan("com.funtl.oauth2.resource.mapper")
public class Oauth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourceApplication.class,args);
    }
}
