package tms.c29.lec_2.classwork.point_5;

public class ReturnExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int y = 11;
            if (i == 5) {
                return;
            }

            y++;
            System.out.println("y = " + y);

            System.out.println("i = " + i);
        }

        System.out.println("After cycle");
    }
}
