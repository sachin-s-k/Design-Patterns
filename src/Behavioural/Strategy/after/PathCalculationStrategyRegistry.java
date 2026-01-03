package Behavioural.Strategy.after;

import java.util.HashMap;

public class PathCalculationStrategyRegistry {

    private HashMap<TransportMode, PathCalculationStrategy> pathCalculationStrategyMap;

    public void register(TransportMode mode, PathCalculationStrategy pathCalculationStrategy){
        pathCalculationStrategyMap.put(mode, pathCalculationStrategy);
    }

    public  PathCalculationStrategy getPathCalculationStrategy(TransportMode mode){
        return pathCalculationStrategyMap.get(mode);
    }
}
