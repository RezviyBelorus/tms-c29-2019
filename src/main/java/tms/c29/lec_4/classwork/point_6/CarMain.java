package tms.c29.lec_4.classwork.point_6;

public class CarMain {
    public static void main(String[] args) {
        Car ford = new Car("Ford", "4567 AB-7");
        Car ford_2 = new Car("Ford", "4333 MI-7");
        Car ford_3 = ford_2;

        System.out.println(ford);
        System.out.println(ford_2);

        System.out.println(ford.equals(ford_2));
        System.out.println(ford_3.equals(ford_2));

        ford_2.setName("BMW");

        System.out.println("ford_3.getName(): " + ford_3.getName());

        Car.sayHi();
    }
}
