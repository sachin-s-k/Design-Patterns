package Behavioural.Strategy.after;

public class BikePathCalculator implements PathCalculationStrategy{
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Bike path calculation Strategy");
    }
}
