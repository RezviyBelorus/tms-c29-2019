package tms.c29.lec_6.classwork.point_1;

import java.util.Objects;

public class ClassStructure {
    private static final String MESSAGE = "MESSAGE";

    private final String FUEL = "ROCKET FUEL";

    private int age;
    private int width;

    private String name;

    public ClassStructure() {
    }

    public ClassStructure(int age) {
        this.age = age;
    }

    public ClassStructure(int age, int width, String name) {
        this.age = age;
        this.width = width;
        this.name = name;
    }

    public void showMessage(String message) {
        String formattedMessage = format(message);
        System.out.println(formattedMessage);
    }

    private String format(String message) {
        return message + "!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassStructure that = (ClassStructure) o;
        return age == that.age &&
                width == that.width &&
                Objects.equals(FUEL, that.FUEL) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FUEL, age, width, name);
    }

    @Override
    public String toString() {
        return "ClassStructure{" +
                "FUEL='" + FUEL + '\'' +
                ", age=" + age +
                ", width=" + width +
                ", name='" + name + '\'' +
                '}';
    }
}
