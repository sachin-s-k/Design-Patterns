import creationaldesignpattern.singleton.solution.ConfigManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigManager  configManager = ConfigManager.getInstance();
        configManager.set( "name", "mosh");

        System.out.println(configManager.get("name"));

    }
}