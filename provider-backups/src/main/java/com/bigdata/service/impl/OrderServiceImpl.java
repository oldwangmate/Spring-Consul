package com.bigdata.service.impl;

import com.bigdata.domain.Order;
import com.bigdata.mapper.OrderMapper;
import com.bigdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> orderFindAll() {
        return orderMapper.orderFindAll();
    }
}
