package creationaldesignpattern.abstractFactory.primary;

import creationaldesignpattern.abstractFactory.Theme;
import creationaldesignpattern.abstractFactory.ThemeComponentFactory;

public class PrimaryTheme  extends Theme {


    @Override
    public ThemeComponentFactory themeComponentFactory() {
        return  new PrimaryThemFactory();
    }
}
