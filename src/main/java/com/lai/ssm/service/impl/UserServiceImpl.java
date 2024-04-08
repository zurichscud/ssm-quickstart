package com.lai.ssm.service.impl;

import com.lai.ssm.bean.User;
import com.lai.ssm.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @Author: zurichscud
 * @Date: 2024/4/8 上午10:01
 * @Description: TODO
 */
@Service
public class UserServiceImpl {
    @Resource
    private UserMapper mapper;
    public List<User> findAll() {
        return mapper.selectAll();
    }
}
