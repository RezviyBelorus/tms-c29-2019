package tms.c29.lec_13.classwork.part_1;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student
            .setName("name")
            .setAge(13);
    }
}
