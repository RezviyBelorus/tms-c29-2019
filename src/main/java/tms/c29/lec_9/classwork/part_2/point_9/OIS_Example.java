package tms.c29.lec_9.classwork.part_2.point_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OIS_Example {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/tms/c29/lec_9/classwork/part_2/point_9/object");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
