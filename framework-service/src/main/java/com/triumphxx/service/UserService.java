package com.triumphxx.service;

import com.triumphxx.entity.UserEntity;

import java.util.List;

/**
 * @author:triumphxx
 * @Date:2020/5/24
 * @Time:6:06 下午
 * @微信公众号：北漂码农有话说
 * @desc:用户服务类
 **/
public interface UserService {
    List<UserEntity> selectUser();
}
