package Container;

public class TesteContainer {
    public static void main(String args[]){
        Container c1 = new GridContainer(2,2);
        Component button = new Component("Botao");

        c1.addComponent(button);
        c1.addComponent(button);
        c1.addComponent(button);
        c1.addComponent(button);

        c1.doLayout();

        Container c2 = new FlowContainer();
        c2.addComponent(button);
        c2.addComponent(button);
        c2.addComponent(button);
        c2.addComponent(button);
        c2.doLayout();
    }
}
