package Composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> components;

    public Composite() {
        this.components = new ArrayList<>();
    }

    @Override
    public void operation() {
        for(Component eachComponent : components){
            eachComponent.operation();
        }
    }

    public Composite add(Component component) {
        if(!components.contains(component)){
            components.add(component);
            return this;
        }
        return this;
    }

    public boolean remove(Component component) {
        if(components.contains(component)){
            for(int i=0; i<components.size(); i++){
                if(components.get(i).equals(component)){
                    components.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
}
