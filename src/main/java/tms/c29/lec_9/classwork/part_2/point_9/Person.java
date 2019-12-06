package tms.c29.lec_9.classwork.part_2.point_9;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -4887554014511370212L;

    private String name;
    private String surname;
    private int age;
    private Work work;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Person(String name, String surname, int age, Work work) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.work = work;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
