package tms.c29.lec_9.classwork.part_2.point_9;

import java.io.*;

public class OOS_Example {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/tms/c29/lec_9/classwork/part_2/point_9/object");
             ObjectOutputStream dos = new ObjectOutputStream(fos)) {
//            Person name = new Person("Name", "Surname", 33, new Work("Developer"));
//            dos.writeObject(name);

            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
