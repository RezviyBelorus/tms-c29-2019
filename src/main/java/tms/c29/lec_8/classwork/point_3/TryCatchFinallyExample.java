package tms.c29.lec_8.classwork.point_3;

import java.util.Scanner;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        String string = null;
        try {
            Scanner scanner = new Scanner(System.in);
            string = scanner.next();
            Integer number = Integer.valueOf(string);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format" + string);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catch");
            System.out.println("Catch");
            e.printStackTrace();
        } finally {
            System.out.println("Block finally");
        }
    }
}
