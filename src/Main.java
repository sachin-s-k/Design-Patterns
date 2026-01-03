import Structural.decorator.Icecreamcone;
import Structural.decorator.OrangeCone;
import Structural.decorator.Vanila;
import creationaldesignpattern.singleton.solution.ConfigManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Icecreamcone orangeCone = new Vanila(new OrangeCone());
        System.out.println(orangeCone.getConstituents());

    }
}