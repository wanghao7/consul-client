package com.wanghao.springcloud.service;

import com.wanghao.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * 根据ID 查询对象
     * @param id
     * @return
     */
    public User getUserById(Integer id){
        User user = new User();
        user.setId(id);
        user.setUsername("userName:"+id);
        return user;
    }


    /**
     * 根据ID 查询用户名称
     * @param id
     * @return
     */
    public String getUsernameById(Integer id){
       User user =  getUserById(id);
        return user.getUsername();
    }
}
