package com.triumphxx.service.impl;

import com.triumphxx.mapper.UserMapper;
import com.triumphxx.entity.UserEntity;
import com.triumphxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:triumphxx
 * @Date:2020/5/24
 * @Time:6:06 下午
 * @微信公众号：北漂码农有话说
 * @desc:用户服务实现类
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserEntity> selectUser() {
        return userMapper.selectUser();
    }
}
