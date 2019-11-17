package com.funtl.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Desription:
 *
 * @ClassName OAuth2ServiceApplication
 * @Author Zhanyuwei
 * @Date 2019/11/16 22:15
 * @Version 1.0
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.funtl.oauth2.service.mapper")
public class OAuth2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServiceApplication.class,args);
    }
}
