package com.dongms.myspringboot.controller;

import com.dongms.myspringboot.entity.UserEntity;
import com.dongms.myspringboot.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Setter
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public List<UserEntity> findUser(){
        return userService.findAllUser();
    }
}