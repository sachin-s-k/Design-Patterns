package Structural.adapter.razorpay;

public class RazorpayGateWay {


  public   String payBycreditCard(String cardNumber, String cvv, String expiry) {
        System.out.println("Payment Done by Razorpay");
        return "123";
    }

    public boolean  checkPaymentStatus(String id){
        return false;

    }
}
