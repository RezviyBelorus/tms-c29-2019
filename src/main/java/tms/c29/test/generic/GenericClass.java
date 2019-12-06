package tms.c29.test.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericClass<T> {
    private T id;

    public GenericClass(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericClass<?> that = (GenericClass<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        GenericClass<Integer> integerGenericClass = new GenericClass("AAA");
        GenericClass<String> stringGenericClass = new GenericClass("222");

        List<Number> arr = new ArrayList<>();
        arr.add(123.5);
        arr.add(1);
        System.out.println(arr);

        if (integerGenericClass.getId() instanceof Integer) {
            System.out.println("sex");
        }
//        Integer id = integerGenericClass.getId();
//        System.out.println(id);

        showId(integerGenericClass.getId());
    }

    private static void showId(Integer id) {
        System.out.println(id);
    }
}
