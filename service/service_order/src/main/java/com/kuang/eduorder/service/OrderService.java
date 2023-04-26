package com.kuang.eduorder.service;

import com.kuang.eduorder.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;


public interface OrderService extends IService<Order> {

    //生成订单的方法
    String createOrders(String courseId, String memberIdByJwtToken);
}
