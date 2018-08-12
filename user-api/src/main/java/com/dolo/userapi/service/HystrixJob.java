package com.dolo.userapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//开启定时任务
@EnableScheduling
public class HystrixJob {
    @Autowired
    private UserClient testClient;
    @Scheduled(cron = "0/20 * * * * ?")
    public void doJob(){
        try{
            System.out.println("job调用测试=====================");
            testClient.getuserinfo();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
