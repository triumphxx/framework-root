package com.triumphxx.mapper;

import com.triumphxx.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:triumphxx
 * @Date:2020/5/24
 * @Time:5:38 下午
 * @微信公众号：北漂码农有话说
 * @desc:用户查询
 **/
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<UserEntity> selectUser();
}
