package tms.c29.lec_2.classwork.point_1;

public class IfExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("Hello");
        } else {
            System.out.println("else");
        }

        if (x < 8) {
            System.out.println("x < 8");
        } else if (x < 9) {
            System.out.println("x < 9");
        } else {
            System.out.println("default: " + x);
        }

        if (x < 8) {
            //
        }

        if (x < 9) {
            //
        }  else {

        }

        System.out.println("After if");
    }
}
