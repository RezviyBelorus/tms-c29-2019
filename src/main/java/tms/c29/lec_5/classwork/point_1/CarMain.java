package tms.c29.lec_5.classwork.point_1;

public class CarMain {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.move();
        audi.openDoor();
        audi.getCurrentTransmission();

        Car newAudi = new Audi();
        newAudi.move();
        newAudi.openDoor();
//        newAudi.getCurrentTransmission();

    }
}
