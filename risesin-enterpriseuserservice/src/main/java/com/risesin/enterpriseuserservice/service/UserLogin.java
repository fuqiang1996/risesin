package com.risesin.enterpriseuserservice.service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogin {

    @RequestMapping("/account/entuser")
    public String login(){
        return "ok";
    }

}
