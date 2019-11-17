package com.funtl.oauth2.resource.controller;

import com.funtl.oauth2.resource.domain.TbContent;
import com.funtl.oauth2.resource.dto.ResponseResult;
import com.funtl.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Desription:
 *
 * @ClassName TbContentController
 * @Author Zhanyuwei
 * @Date 2019/11/17 17:20
 * @Version 1.0
 **/

@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> list() {

        return new ResponseResult<List<TbContent>>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), tbContentService.selectAll());
    }

}
