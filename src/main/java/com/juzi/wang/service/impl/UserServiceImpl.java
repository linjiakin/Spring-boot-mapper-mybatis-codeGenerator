package com.juzi.wang.service.impl;

import com.juzi.wang.mapper.UserMapper;
import com.juzi.wang.model.User;
import com.juzi.wang.service.UserService;
import com.juzi.wang.common.base.BaseAbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by JuziWang on 2018-03-14.
 */
@Service
@Transactional
public class UserServiceImpl extends BaseAbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
