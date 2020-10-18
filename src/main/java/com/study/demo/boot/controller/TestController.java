package com.study.demo.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oulei
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String  test(){
        return "测试成功!";
    }


}
