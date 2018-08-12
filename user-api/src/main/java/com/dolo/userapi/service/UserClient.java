package com.dolo.userapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/getuser")
    public User getuserinfo();
    
    @RequestMapping(method = RequestMethod.GET, value = "/getuser")
    public String getuserinfostr();
    
    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public  String  info();

}