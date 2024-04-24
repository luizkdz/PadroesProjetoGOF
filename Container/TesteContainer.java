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


        BorderPontilhada pontilhada = new BorderPontilhada();
        Container c3 = new FlowContainer(pontilhada);

        c3.doLayout();

        BorderSolida bordaSolida = new BorderSolida();
    Container c4 = new GridContainer(2,2,bordaSolida);
    c4.addComponent(button);
    c4.addComponent(button);
    c4.addComponent(button);
    c4.addComponent(button);

    c4.doLayout();
    }
}
