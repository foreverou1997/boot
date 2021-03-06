package com.study.demo.boot.controller.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oulei
 */
@RestController
@RefreshScope
public class NacosConfigController {

    @Value("${test.name}")
    private String testName;


    @GetMapping("/getConfigTest")
    public String getConfigTest(){
        return testName;
    }



}
