import java.util.ArrayList;
import java.util.List;

public class Computer {
    String id;
    String brand;

    List<Component> componentList;

    public Computer(String id, String brand) {
        this.id = id;
        this.brand = brand;
        componentList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Component> getComponents() {
        return List.copyOf(componentList);
    }

    public boolean addComponent(Component c){
        if(componentList.contains(c))
            return false;
        componentList.add(c);
        return true;
    }

    public Component removeComponent(String id) {
        for (Component component : componentList){
            if  (component.getId().equals(id)){
                componentList.remove(component);
                return component;
            }
        }
        return null;
    }

    public String toString(){
        return "ID: " + id + ", Brand: " + brand;
    }
}
