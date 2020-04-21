package com.wanghao.springcloud.model;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String orderno;
    private Integer userId;
}
