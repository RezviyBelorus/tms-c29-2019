package tms.c29.lec_6.classwork.point_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateClubPrivateConstructorMain {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        PrivateClub privateClub = new PrivateClub();
        System.out.println(privateClub);

//        PrivateClub new_name = new PrivateClub("New name");

        Class<PrivateClub> privateClubClass = PrivateClub.class;

        Constructor<?>[] constructors = privateClubClass.getDeclaredConstructors();

        PrivateClub newName = null;
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            for (Class<?> parameterType : parameterTypes) {
                if (String.class.getName().equals(parameterType.getName())) {
                    constructor.setAccessible(true);
                    newName = (PrivateClub) constructor.newInstance("New name");
                }
            }
        }

        System.out.println("=== New name ===");
        System.out.println(newName);
    }
}
