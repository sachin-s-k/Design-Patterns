package creationaldesignpattern.abstractFactory.secondary;

import creationaldesignpattern.abstractFactory.Theme;
import creationaldesignpattern.abstractFactory.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory themeComponentFactory() {
        return new DarkThemeFactory();
    }
}
