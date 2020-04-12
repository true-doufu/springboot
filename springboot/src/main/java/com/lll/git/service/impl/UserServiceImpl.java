package com.lll.git.service.impl;


import com.lll.git.dto.UserDTO;
import com.lll.git.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public int add(UserDTO userDTO) {

        System.out.println("user t添加成功");

        return 0;
    }
}
