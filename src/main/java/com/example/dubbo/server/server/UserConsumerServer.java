package com.example.dubbo.server.server;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.server.vo.User;
import org.springframework.stereotype.Component;

/**
 * @author yushengma
 */
@Component("userConsumerServer")
public class UserConsumerServer {

    @Reference(version = "1.0.0")
    UserServer userServer;

    public void printUser(){
        User user = userServer.getUserByName("ma");
        System.out.println("========================================= \n"
                + "name: " + user.getUserName() + ", age: " + user.getAge() + ", sex: " + user.getSex());
    }
}
