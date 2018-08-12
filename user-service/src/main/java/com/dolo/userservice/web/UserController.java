package com.dolo.userservice.web;

import com.dolo.userservice.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final Logger    logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        return "success";
    }

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public User add() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/getuser, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        User usr = new User();
        usr.setName("dolojia");
        usr.setSex(18);
        return usr;
    }

}
