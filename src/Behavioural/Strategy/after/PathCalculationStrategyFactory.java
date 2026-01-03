package Behavioural.Strategy.after;

public class PathCalculationStrategyFactory {

  public  PathCalculationStrategy getPathCalculationStrategyForMode(TransportMode mode) {

      if (mode == TransportMode.BIKE) {
          System.out.println("bike");
          return new BikePathCalculator();

      } else if (mode == TransportMode.WALK) {
          System.out.println("walk");
          return new WalkingPathCalculator();

      } else if (mode == TransportMode.CAR) {
          System.out.println("car");
          return new CarPathCalculator();


      }
      throw new UnsupportedOperationException("Not supported yet.");

  }
}
