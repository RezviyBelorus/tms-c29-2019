package tms.c29.lec_9.classwork.part_1;

import java.util.Scanner;

public class TryCatchLocalVar {
    public static void main(String[] args) {
        String next = null;
        boolean isRunning = true;
        while (isRunning) {
            try {
                Scanner scanner = new Scanner(System.in);
                next = scanner.next();
                Integer number = Integer.valueOf(next);
                System.out.println("After parsing");
                isRunning = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number format: " + next);
            }
        }
        System.out.println("After try-catch");
    }
}
