package Behavioural.Strategy.after;



public class Main {
    public static void main(String[] args) {
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();
        pathCalculationStrategyRegistry.register(TransportMode.WALK, new WalkingPathCalculator());
        pathCalculationStrategyRegistry.register(TransportMode.CAR, new CarPathCalculator());
        pathCalculationStrategyRegistry.register(TransportMode.BIKE, new BikePathCalculator());
        GoogleMaps googleMaps = new GoogleMaps (pathCalculationStrategyRegistry);
        googleMaps.findPath("g", "to",TransportMode.BIKE);
    }
}
