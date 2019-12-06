package tms.c29.lec_5.classwork.point_1;

public class Audi implements Car {
    private int currentTransmission;
    @Override
    public void move() {
        System.out.println("Moving");
    }

    @Override
    public void openDoor() {
        System.out.println("My best audi's door opened");
    }

    public int getCurrentTransmission() {
        return currentTransmission;
    }

    static String showInterface() {
        return "I'm an Audi";
    }
}
