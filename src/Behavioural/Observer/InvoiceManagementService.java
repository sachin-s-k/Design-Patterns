package Behavioural.Observer;

public class InvoiceManagementService implements  Subscriber{

    public InvoiceManagementService() {
        Flipkart.registerSubscriber(Events.ORDER_PLACED,this);
    }

    void generateInvoice(Order order){

        System.out.println("Invoice Generated");

    }


    @Override
    public void listen(Object order) {
        generateInvoice((Order) order);
    }
}
