package Structural.decorator;

public class Vanila implements Icecreamcone {
    private Icecreamcone iceCreamCone;
    public Vanila(Icecreamcone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;

    }
    @Override
    public String getConstituents() {
        return iceCreamCone.getConstituents()+"vanila";

    }
    @Override
    public int getCost() {
        return iceCreamCone.getCost()+100;
    }
}
