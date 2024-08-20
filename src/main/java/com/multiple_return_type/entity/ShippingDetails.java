package com.multiple_return_type.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingDetails {

    private String shippingAddress;
    private String deliveryDate;
    private String trackingNumber;

}
