package com.triumphxx.entity;

import lombok.Data;

/**
 * @author:triumphxx
 * @Date:2020/5/24
 * @Time:5:36 下午
 * @微信公众号：北漂码农有话说
 * @desc:用户实体类
 **/
@Data
public class UserEntity {
    private String username;
    private int id;
    private String password;
}
