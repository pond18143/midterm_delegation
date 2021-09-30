package delegation;

public class SuperComponent {
    private static SuperComponent superCom = null;

    private SuperComponent() {
    }

    public static SuperComponent getSuperComponent() {
        if (superCom == null) {
            superCom = new SuperComponent();
        }
        return superCom;
    }

    public void execute(int inp) {
        if (inp >= 0) {
            Foo obj1 = new Foo();
            obj1.func();
        } else {
            Bar obj2 = new Bar();
            obj2.func();
        }
    }

    public static void main(String[] args) {
        SuperComponent obj = SuperComponent.getSuperComponent();
        obj.execute(4);
        obj.execute(-1);
    }
}