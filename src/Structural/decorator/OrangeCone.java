package Structural.decorator;

public class OrangeCone implements Icecreamcone{

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getConstituents() {
        return "OrangeCone";
    }
}
