package tms.c29.lec_9.classwork.part_2.point_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Buff_Example {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/tms/c29/lec_9/practice/task.txt");
             BufferedInputStream buff = new BufferedInputStream(fis)
        ) {
            byte[] bytes = new byte[8192];
            int n;
            while ((n = buff.read(bytes)) != -1) {
                System.out.print(Arrays.toString(bytes));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
