package tms.c29.lec_5.classwork.point_5;

public class Intern {
    private String name;

    public Intern(String name) {
        this.name = name;
    }

    public Intern() {
        System.out.println("Intern's constructor");
    }
}

class Doctor extends Intern {
    private int age;

    public Doctor(String name) {
        this(name, 13);
        System.out.println("Doctor's constructor");
    }

    public Doctor(String name, int age) {
//        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "age=" + age +
                '}';
    }
}