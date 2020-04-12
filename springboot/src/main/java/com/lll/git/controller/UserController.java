package com.lll.git.controller;


import com.lll.git.dto.UserDTO;
import com.lll.git.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {


    @Resource
    private UserService userService;


    @GetMapping(value = "/get")
    public Object get() {
        int add = userService.add(new UserDTO());
        return add;
    }


}
