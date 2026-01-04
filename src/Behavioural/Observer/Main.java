package Behavioural.Observer;

public class Main {

    public static void main(String[] args) {

Flipkart flipkart = new Flipkart();
Order order = new Order();
flipkart.notify(Events.ORDER_PLACED,order);
    }
}
