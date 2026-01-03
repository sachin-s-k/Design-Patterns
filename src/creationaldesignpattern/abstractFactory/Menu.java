package creationaldesignpattern.abstractFactory;

import creationaldesignpattern.abstractFactory.primary.PrimaryTheme;

public abstract class Menu {

    public static class Client {
        public static void main(String[] args) {
            Theme PrimaryTheme = new PrimaryTheme();

        }
    }
}
