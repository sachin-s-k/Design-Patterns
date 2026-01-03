package Structural.adapter;

import Structural.adapter.razorpay.RazorpayGateWay;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway {


    private RazorpayGateWay razorpayGateWay= new RazorpayGateWay();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
         String expiry= String.valueOf(expiryMonth)+"/"+String.valueOf(expiryYear);
         String answer= razorpayGateWay.payBycreditCard(cardNumber,cvvString,expiry);
        return Long.valueOf(answer);
    }

    @Override
    public PaymentStatus getStatus(Long transactionId) {
    boolean status=razorpayGateWay.checkPaymentStatus(String.valueOf(transactionId));

    if(status){
        return PaymentStatus.SUCCESS;
    }else {
        return PaymentStatus.FAILURE;
    }
    }
}
