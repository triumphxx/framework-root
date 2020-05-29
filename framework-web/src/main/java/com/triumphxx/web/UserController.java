package com.triumphxx.web;

import com.triumphxx.entity.UserEntity;
import com.triumphxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:triumphxx
 * @Date:2020/5/24
 * @Time:6:43 下午
 * @微信公众号：北漂码农有话说
 * @desc:用户接口类
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("")
    public List<UserEntity> selectUser(){
        return userService.selectUser();
    }
}
