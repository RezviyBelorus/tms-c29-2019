package tms.c29.test.lec_6;

import java.lang.reflect.Field;

public class PrivateFieldChangeExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateClub privateClub = new PrivateClub();
        System.out.println(privateClub);

        Class<? extends PrivateClub> privateClubClass = privateClub.getClass();

        Field name = privateClubClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateClub, "Izya");

        System.out.println(privateClub);
    }
}
