package tms.c29.lec_4.classwork.point_6;

public class EqualsHashCodeMain {
    public static void main(String[] args) {
        Integer x = 127;
        Integer y = 127;
        Integer z = x;

        System.out.println(x == y);
        System.out.println(x == z);

    }
}
