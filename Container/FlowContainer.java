package Container;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {

    
    private List<Component> elements;


    public FlowContainer(){
        elements = new ArrayList<Component>();

    }


    @Override
    public void addComponent(Component c) {
        elements.add(c);
    }


    @Override
    public void removeComponent(Component c) {
        elements.remove(c);
    }


    @Override
    public void doLayout() {
        
    }

}

