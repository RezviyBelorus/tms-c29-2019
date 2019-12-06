package tms.c29.lec_2.classwork.point_5;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.println("i = " + i);
        }

        System.out.println("After cycle");
    }
}
