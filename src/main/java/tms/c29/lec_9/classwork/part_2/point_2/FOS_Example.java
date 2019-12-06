package tms.c29.lec_9.classwork.part_2.point_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOS_Example {

    private static final String FILE_PATH = "src/tms/c29/lec_9/classwork/part_2/point_2/output";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {
            fos.write(666);
            fos.write("\n".getBytes());
            fos.write("Hello from Java".getBytes());

            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
