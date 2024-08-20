package com.multiple_return_type.service;

import com.multiple_return_type.entity.OrderDetails;

public class OrderDetailsService {
    public static OrderDetails getOrder(String orderId){
        return new OrderDetails(orderId, "Laptop", 1L);
    }
}
