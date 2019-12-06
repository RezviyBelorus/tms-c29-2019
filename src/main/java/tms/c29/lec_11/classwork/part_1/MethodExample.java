package tms.c29.lec_11.classwork.part_1;

import java.io.File;

public class MethodExample {
    private static final String PATH = "my_path";

    public static void main(String[] args) {
        File rename = rename(PATH);
    }

    private static File rename(String path) {
        File file = new File(path);
        return file;
    }
}
