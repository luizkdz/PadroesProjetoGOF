package Container;
public abstract class Container {

        protected Border border;

        
            public Container() {
        }

            public Container(Border border) {
            this.border = border;
        }

            public abstract void addComponent(Component c);

            public abstract void removeComponent(Component c);

            public abstract void doLayout();
}
