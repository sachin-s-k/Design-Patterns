package Structural.decorator;

public class BlueCone implements Icecreamcone{
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getConstituents() {
        return "BlueCone";
    }
}
