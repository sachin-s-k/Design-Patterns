package creationaldesignpattern.abstractFactory;


// step 1 : create parent class
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;


public abstract ThemeComponentFactory  themeComponentFactory();


}
