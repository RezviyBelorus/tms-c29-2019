package tms.c29.lec_6.classwork.point_3;

public class RecursionExample {
    public static void main(String[] args) {
        int result = calculate(0);

        System.out.println(result);
    }

    private static int calculate(int number) {
        if (number < 10) {
            return calculate(number + 1);
        }
        return number;
    }
}
