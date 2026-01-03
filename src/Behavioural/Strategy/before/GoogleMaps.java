package Behavioural.Strategy.before;

import Behavioural.Strategy.after.PathCalculationStrategyRegistry;

public class GoogleMaps {


    public void findPath(String from, String to, TransportMode mode) {
        if(mode.equals(TransportMode.BIKE)){
            System.out.println("fina Bike Path");
        }
       else if(mode.equals(TransportMode.WALK)){
            System.out.println("fina Walk Path");

        }else if(mode.equals(TransportMode.CAR)){
           System.out.println("fina Car Path");
        }

    }
}
