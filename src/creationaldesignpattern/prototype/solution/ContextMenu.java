package creationaldesignpattern.prototype.solution;

public class ContextMenu {
    public void duplicate(Component component){
      Component newComponent = component.clone();
    }
}
