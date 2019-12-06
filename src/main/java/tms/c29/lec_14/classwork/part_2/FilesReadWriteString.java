package tms.c29.lec_14.classwork.part_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesReadWriteString {
    private static final String PATH = "/Users/alexfomin/IdeaProjects/tms/tms-c29-2019/src/tms/c29/lec_14/practice/task.txt";
    public static void main(String[] args) throws IOException {
        String allFileText = Files.readString(Path.of(PATH));

        System.out.println(allFileText);


    }
}
