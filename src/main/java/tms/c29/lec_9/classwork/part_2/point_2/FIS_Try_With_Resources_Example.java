package tms.c29.lec_9.classwork.part_2.point_2;

import java.io.FileInputStream;
import java.io.IOException;

public class FIS_Try_With_Resources_Example {
    private static final String FILE_PATH = "src/tms/c29/lec_9/practice/task.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
