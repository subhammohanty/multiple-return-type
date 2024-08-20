package com.multiple_return_type.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {

    private String orderId;
    private String product;
    private Long quantity;
}
