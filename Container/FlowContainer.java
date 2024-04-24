package Container;

import java.util.ArrayList;
import java.util.List;

public class FlowContainer extends Container {

    protected List<Component> elements;


    public FlowContainer(){
        elements = new ArrayList<Component>();

    }
    
    public FlowContainer(Border border){
        super(border);
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
        if(border != null){
            border.generateBorder();
        }
        System.out.println("Usando flow container");
    }


}

