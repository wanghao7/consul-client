package com.wanghao.springcloud.service;

import com.wanghao.entity.User;
import com.wanghao.springcloud.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    /**
     * 根据ID 查询Order对象
     * @param id
     * @return
     */
    public Order getUserById(Integer id){
        Order order = new Order();
        order.setId(id);
        order.setOrderno(System.currentTimeMillis()+"");
        order.setUserId(1);
        return order;
    }



}
