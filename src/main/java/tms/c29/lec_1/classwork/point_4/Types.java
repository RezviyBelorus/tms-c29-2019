package tms.c29.lec_1.classwork.point_4;

public class Types {
    public static void main(String[] args) {
        // byte, short, char, int
        /*
        byte 2^8 -> 2^7-1
        short 2^16
        char 2^16
        int 2^32
        long 2^64
        */

        byte myByte = 127;
        myByte = 100;

        System.out.println(myByte);

        char myCharNumber = 33;
        char myCharSymbol = 'K';
        char myCharUtf = '\u33f4';
        System.out.println("myCharNumber = " + myCharNumber);
        System.out.println("myCharSymbol = " + myCharSymbol);
        System.out.println("myCharUtf = " + myCharUtf);

        System.out.println(1 + myCharUtf);

        // float, double
        float myFloat = 33;
        double myDouble = 44;

        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println(1.4 + 1.7);

        //boolean - true/false
        boolean myBoolean = false;
        System.out.println("myBoolean = " + myBoolean);

        // String
        String myString = "Alex";
        System.out.println("myString = " + myString);
    }
}
