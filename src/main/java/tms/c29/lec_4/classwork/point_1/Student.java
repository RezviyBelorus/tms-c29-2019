package tms.c29.lec_4.classwork.point_1;

public class Student {
    private static String className;

    private String name;
    private int age;
    protected String surname;
    public double height;

    static {
        System.out.println("static init block");
        className = "C-29";
    }

    {
        System.out.println("init block");
        this.name = "Default name";
    }

    public Student() {
        this("Kolya", 21);
        System.out.println("0 args constructor");
    }

    public Student(String name) {
        this(name, 33);
        System.out.println("1 arg constructor");
    }

    public Student(String name, int age) {
        System.out.println("2 args constructor");
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setClassName(String className) {
        Student.className = className;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    String getClassName() {
        return className;
    }
}
