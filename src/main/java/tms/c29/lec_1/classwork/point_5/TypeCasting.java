package tms.c29.lec_1.classwork.point_5;

public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = 120;
        short mySHort = myByte;

        // 200 - 256 = -56
        // -200 + 256
        mySHort = 200;

        myByte = (byte) mySHort;

        System.out.println(myByte);

        int myInt = myByte;

        String myString = "Hello";
        Byte myByteClass = myByte;

        // int -> Integer; char -> Character

        double myDouble = 33.67;
        myInt = (int) myDouble;

        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt = " + myInt);
    }
}
