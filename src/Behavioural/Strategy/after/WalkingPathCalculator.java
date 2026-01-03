package Behavioural.Strategy.after;

public class WalkingPathCalculator implements PathCalculationStrategy{
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("walking path calculation Strategy");

    }
}
