package tms.c29.lec_5.classwork.point_2;

public class Maincoon extends AbstractCat implements C, D {
    private String name;

    public Maincoon(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Maincoon is still hungry");
    }

    @Override
    public void say() {
        System.out.println("Hello from C");
    }
}

interface C {
    default void say() {
        System.out.println("Hello from C");
    }
}

interface D {
    default void say() {
        System.out.println("Hello from D");
    }
}
