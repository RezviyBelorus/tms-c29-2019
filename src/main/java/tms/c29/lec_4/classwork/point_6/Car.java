package tms.c29.lec_4.classwork.point_6;

import java.util.Objects;

public class Car {
    private String name;
    private String number;

    public Car(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    public static void sayHi() {
        System.out.println("Hi");
    }
}
