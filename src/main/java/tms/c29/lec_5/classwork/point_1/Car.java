package tms.c29.lec_5.classwork.point_1;

public interface Car {
    int MAX_SPEED = 355;

    void move();

    default void openDoor() {
        System.out.println("Door opened");
    }

    static String showInterface() {
        return "I'm a car";
    }
}
