package com.lai.ssm.controller;

import com.lai.ssm.bean.User;
import com.lai.ssm.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zurichscud
 * @Date: 2024/4/7 下午6:07
 * @Description: TODO
 */
@Controller
public class UserController {
    @Resource
    private UserServiceImpl userService;
    @RequestMapping("/test")
    @ResponseBody
    public Object hi(){
        System.out.println("hello");
        List<User> all = userService.findAll();

        return all;
    }
}


