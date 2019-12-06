package tms.c29.lec_9.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class IS {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/tms/c29/lec_9/practice/task.txt");
//        int n = 0;
//        while ((n = fr.read()) != -1) {
//            System.out.print((char) n);
//        }


        char[] buf = new char[256];
        int c;
        while ((c = fr.read(buf)) > 0) {
//            if (c < 256) {
//                buf = Arrays.copyOf(buf, c);
//            }
            System.out.print(buf);
        }
//        System.out.println(buf);
    }

}
