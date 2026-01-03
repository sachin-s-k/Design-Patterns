package creationaldesignpattern.abstractFactory;

import creationaldesignpattern.abstractFactory.secondary.DarkTheme;

public class Client {

    public static void main(String[] args) {
        Theme primaryTheme = new DarkTheme();
        ThemeComponentFactory themeComponentFactory= primaryTheme.themeComponentFactory();
        Button button= themeComponentFactory.createButton();
        Menu menu= themeComponentFactory.createMenu();


    }
}
