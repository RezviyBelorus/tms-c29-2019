package tms.c29.lec_3.classwork.point_3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("How old r u?");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}
