package com.bigdata.mapper;

import com.bigdata.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("select * from shop_order")
    List<Order> orderFindAll();
}
