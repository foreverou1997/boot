package com.study.demo.boot.controller.rocketmq;

import com.study.demo.boot.domain.dto.UserDTO;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rocketMq")
public class TestMqController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/test")
    public String sendMsg(){
        rocketMQTemplate.convertAndSend("test",new UserDTO("123", "测试"));
        return "消息发送成功";
    }

}
