package com.multiple_return_type.service;

import com.multiple_return_type.entity.PaymentDetails;

public class PaymentDetailsService {

    public static PaymentDetails getPaymentDetails(String orderId){
        return new PaymentDetails(orderId, "123456");
    }
}
