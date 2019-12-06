package tms.c29.lec_8.classwork.point_1;

import java.util.Objects;

public class Spaces {

    private int age;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spaces spaces = (Spaces) o;
        return age == spaces.age &&
                Objects.equals(name, spaces.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

interface A {
    void sayHi();

    void sayYo();

}