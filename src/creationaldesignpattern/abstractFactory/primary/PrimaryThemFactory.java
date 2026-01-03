package creationaldesignpattern.abstractFactory.primary;

import creationaldesignpattern.abstractFactory.Button;
import creationaldesignpattern.abstractFactory.Menu;
import creationaldesignpattern.abstractFactory.ThemeComponentFactory;
import creationaldesignpattern.abstractFactory.secondary.DarkButton;
import creationaldesignpattern.abstractFactory.secondary.DarkMenu;

public class PrimaryThemFactory implements ThemeComponentFactory {


    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
