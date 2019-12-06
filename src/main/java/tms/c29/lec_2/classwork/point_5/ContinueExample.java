package tms.c29.lec_2.classwork.point_5;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println("i = " + i);
        }
    }
}
