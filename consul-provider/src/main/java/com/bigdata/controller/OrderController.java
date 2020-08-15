package com.bigdata.controller;

import com.bigdata.domain.Order;
import com.bigdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/findAll")
    public List<Order> findAll(){
      return orderService.orderFindAll();
    }
}
