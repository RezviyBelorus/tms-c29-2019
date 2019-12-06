package tms.c29.lec_6.classwork.point_4;

import java.lang.reflect.Field;

public class PrivateClubChangeFieldValueMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateClub privateClub = new PrivateClub();
        System.out.println(privateClub);

        Class<? extends PrivateClub> privateClubClass = privateClub.getClass();

        Field name = privateClubClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateClub, "Changed name");

        System.out.println(privateClub);
    }
}
