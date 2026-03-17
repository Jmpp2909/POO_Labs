import java.util.ArrayList;
import java.util.List;

public class Component {
    String id;
    String name;
    List<Component> subComponents;

    public Component(String id) {
        this.id = id;
        subComponents = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getSubComponents() {
        return List.copyOf(subComponents);
    }

    public void setSubComponents(List<Component> subComponents) {
        this.subComponents = subComponents;
    }
}
