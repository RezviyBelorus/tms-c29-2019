package tms.c29.lec_9.classwork.part_2.point_7;

import java.io.*;

public class FR_FW_Example {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/tms/c29/lec_9/practice/task.txt");
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter("src/tms/c29/lec_9/practice/task.txt", true)
        ) {
//            int n;
//            char[] chars = new char[256];
//
//            while ((n = br.read(chars)) != -1) {
//                if (n < 256) {
//                    chars = Arrays.copyOf(chars, n);
//                }
//                System.out.println(chars);
//            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
