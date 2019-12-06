package tms.c29.test.lec_6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateClubMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        PrivateClub privateClub = null;

        Class<?> classPrivateClub = Class.forName(PrivateClub.class.getName());

        Constructor<?>[] constructors = classPrivateClub.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                boolean isNeededConstructor = parameterType.getName().equals(String.class.getName());
                if (isNeededConstructor) {
                    constructor.setAccessible(true);
                   privateClub = (PrivateClub) constructor.newInstance("Egor");
                }
            }
        }

        System.out.println(privateClub);
    }
}
