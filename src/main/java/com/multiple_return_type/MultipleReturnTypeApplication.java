package com.multiple_return_type;

import com.multiple_return_type.entity.OrderDetails;
import com.multiple_return_type.entity.PaymentDetails;
import com.multiple_return_type.entity.ShippingDetails;
import com.multiple_return_type.service.OrderDetailsService;
import com.multiple_return_type.service.PaymentDetailsService;
import com.multiple_return_type.service.UserProfileService;
import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleReturnTypeApplication {

	//Immutable Type
	public static Pair<OrderDetails, ShippingDetails> getOrderInfo(String orderId){
		OrderDetails orderDetails = OrderDetailsService.getOrder(orderId);
		ShippingDetails shippingDetails = UserProfileService.getShippingDetails("John");
		return Pair.of(orderDetails, shippingDetails);
	}

	public static Triple<OrderDetails, ShippingDetails, PaymentDetails> getOrderInfoWithTxn(String orderId){
		OrderDetails orderDetails = OrderDetailsService.getOrder(orderId);
		ShippingDetails shippingDetails = UserProfileService.getShippingDetails("John");
		PaymentDetails paymentDetails = PaymentDetailsService.getPaymentDetails(orderId);
		return Triple.of(orderDetails, shippingDetails, paymentDetails);
	}

	//Mutable Type
//	public static Pair<OrderDetails, ShippingDetails> modifyOrderInfo(String orderId){
//		OrderDetails orderDetails = OrderDetailsService.getOrder(orderId);
//		ShippingDetails shippingDetails = UserProfileService.getShippingDetails("John");
//		return MutablePair.of(orderDetails, shippingDetails);
//	}

	public static void main(String[] args) {

		SpringApplication.run(MultipleReturnTypeApplication.class, args);

		Pair<OrderDetails, ShippingDetails> orderInfo = getOrderInfo("ORD123");;
		System.out.println("Order Details " + orderInfo.getLeft());
		System.out.println("Shipping Details " + orderInfo.getRight());

//		//To Modify the value
//		Pair<OrderDetails, ShippingDetails> newOrderInfo = modifyOrderInfo("ORD123");;
//		System.out.println("Order Details " + newOrderInfo.getLeft());
//		newOrderInfo.setValue(new ShippingDetails());
//		System.out.println("Shipping Details " + newOrderInfo.getRight());
		System.out.println("========================");

		Triple<OrderDetails, ShippingDetails, PaymentDetails> ordInfoWithTXn = getOrderInfoWithTxn("ORD123");
		System.out.println("Order Details " + ordInfoWithTXn.getLeft());
		System.out.println("Shipping Details " + ordInfoWithTXn.getMiddle());
		System.out.println("Payment Details " + ordInfoWithTXn.getRight());
	}

}
