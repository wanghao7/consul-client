package com.wanghao.springcloud.controller;

import com.wanghao.entity.User;
import com.wanghao.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据Id查询用户
     * @param id
     * @return
     */
    @RequestMapping("getUserById")
    public User getUserById(@RequestParam("id") Integer id){
        return  userService.getUserById(id);

    }

    /**
     * 根据Id查询用户名称
     * @param id
     * @return
     */
    @RequestMapping("getUsernameById")
    public String getUsernameById(@RequestParam("id") Integer id){
        return  userService.getUsernameById(id);

    }
}
