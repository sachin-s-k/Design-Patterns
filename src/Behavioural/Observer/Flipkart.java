package Behavioural.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flipkart {
    private static Map<Events, List<Subscriber>> subscribers = new HashMap<Events, List<Subscriber>>();

    public  static  void registerSubscriber(Events events,Subscriber subscriber) {
if(!subscribers.containsKey(events)){
    subscribers.put(events, new ArrayList<>());

}

        subscribers.get(events).add(subscriber);
    }
    public void placeOrder(Order order) {
        notify(Events.ORDER_PLACED, order);

    }

    public void notify(Events event, Order order){
for(Subscriber subscriber : subscribers.get(event)){
subscriber.listen(order);

}

    }
}
