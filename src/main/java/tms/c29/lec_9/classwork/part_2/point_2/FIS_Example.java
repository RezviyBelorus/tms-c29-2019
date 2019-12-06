package tms.c29.lec_9.classwork.part_2.point_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS_Example {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/tms/c29/lec_9/practice/task.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
