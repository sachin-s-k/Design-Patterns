package creationaldesignpattern.abstractFactory.secondary;

import creationaldesignpattern.abstractFactory.Button;
import creationaldesignpattern.abstractFactory.Menu;
import creationaldesignpattern.abstractFactory.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
