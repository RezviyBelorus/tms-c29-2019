package tms.c29.lec_1.classwork.point_5;

public class JavaOperations {
    public static void main(String[] args) {
        byte num_1 = 100;
        byte num_2 = 100;

        int sum = num_1 + num_2;
        long myLong = 100;
        long sumLong = sum + myLong;

        System.out.println(100 / 33);
        System.out.println(2 % 4);

        boolean myBoolean = 2 > 4;
        System.out.println(myBoolean);
        System.out.println(2 == 4);
        System.out.println("3 << 2 = " + (3 << 2));
        System.out.println("8 >> 2 = " + (8 >> 2));

        int myInt = 100;
        myInt += 10;
        System.out.println("myInt = " + myInt);

        System.out.println("myInt++ = " + myInt++);

        System.out.println("++myInt = " + ++myInt);
    }
}
