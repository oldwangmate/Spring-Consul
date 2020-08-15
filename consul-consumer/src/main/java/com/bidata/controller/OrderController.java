package com.bidata.controller;

import com.alibaba.fastjson.JSON;
import com.bidata.service.ConsulProvider;
import com.bigdata.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ConsulProvider consulProvider;

    @RequestMapping("/findAll/one")
    public String findAllOne(){
        List<ServiceInstance> instances = discoveryClient.getInstances("consul-provider");
        ServiceInstance instance = instances.get(0);
        String host = instance.getHost();
        int port = instance.getPort();
        String url = "http://" + host +":" +port + "/order/findAll";
        List<Order> forObject = restTemplate.getForObject(url, List.class);
        return JSON.toJSONString(forObject);
    }

    @RequestMapping("/findAll/two")
    public String findAllTwo(){
        System.out.println(consulProvider);
        List<Order> all = consulProvider.findAll();
        return JSON.toJSONString(all);
    }

}
