package Structural.adapter.payUmoney;

public class PayUGateway
{

    public String makeCrediCard(String cardNumber, String cvv, String expiryMonth, String expiryYear)
    {
        System.out.println("Making Credit Card BY pay U");
        return "123";

    }

    public PaymentStatus checkPaymentStatus(String id){
        return PaymentStatus.SUCCESS;
    }



}
