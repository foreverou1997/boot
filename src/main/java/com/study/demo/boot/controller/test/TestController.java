package com.study.demo.boot.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oulei
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "生产者服务调用成功";
    }
}
