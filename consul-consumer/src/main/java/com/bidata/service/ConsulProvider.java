package com.bidata.service;

import com.bigdata.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("consul-provider")
public interface ConsulProvider {

    @GetMapping(value = "/order/findAll")
    public List<Order> findAll();
}
