package tms.c29.lec_5.classwork.point_4;

public final class FinalClass {

}

class Child extends Parent {
    private final String name;

//    {
//        name = "Frodo";
//    }

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Parent {
    protected final void sayHi() {
        System.out.println("Hello");
    }
}