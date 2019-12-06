package tms.c29.lec_9.classwork.part_2.point_6;

import java.io.*;

public class DOS_Example {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/tms/c29/lec_9/classwork/part_2/point_6/dos");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeBoolean(true);
            dos.writeFloat(1.16f);

            dos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fos = new FileInputStream("src/tms/c29/lec_9/classwork/part_2/point_6/dos");
             DataInputStream dos = new DataInputStream(fos)) {

            boolean b = dos.readBoolean();
            System.out.println(b);
            float v = dos.readFloat();
            System.out.println(v);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
