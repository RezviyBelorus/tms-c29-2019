package tms.c29.lec_2.classwork.point_4;

public class WhileExample {
    public static void main(String[] args) {
        int x = 40;

        int iterationNumber = 40;

        while (x < iterationNumber) {
            System.out.println("x = " + x);

            x *= 2;
        }

        do {
            System.out.println("from do-while: x = " + x);

            x *= 2;
        } while (x < iterationNumber);
    }
}
