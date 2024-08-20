package com.multiple_return_type.service;

import com.multiple_return_type.entity.ShippingDetails;

public class UserProfileService {

    public static ShippingDetails getShippingDetails(String userId){
        return new ShippingDetails("123 Tech Lane, Cuttack", "23-12", "123456");
    }
}
