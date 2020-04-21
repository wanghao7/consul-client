package com.wanghao.springcloud.controller;

import com.wanghao.entity.User;
import com.wanghao.springcloud.model.Order;
import com.wanghao.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 根据Id查询用户
     * @param id
     * @return
     */
    @RequestMapping("getOrderById")
    public Order getOrderById(@RequestParam("id") Integer id){
        return  orderService.getUserById(id);

    }

}
