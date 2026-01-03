package Behavioural.Strategy.after;

public class CarPathCalculator implements PathCalculationStrategy{
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("car path calculation Strategy");
    }
}
