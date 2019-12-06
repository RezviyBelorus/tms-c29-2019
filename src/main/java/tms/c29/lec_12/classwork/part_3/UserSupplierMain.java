package tms.c29.lec_12.classwork.part_3;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserSupplierMain {
    public static void main(String[] args) {
        String egorka = "Egorka";

        Supplier<User> userSupplier = () -> new User(egorka);
        Supplier<User> randomUser = User::new;

        User user = userSupplier.get();

        System.out.println(user);

        MyUserSupplier supplier = name -> new User(name);
        MyUserSupplier supplier_2 = User::new;

        Predicate<String> namePredicate = name -> name.startsWith("A");

        User userEgorka = supplier.supply("Egorka");

        namePredicate.test(userEgorka.getName());
    }
}

interface MyUserSupplier {
    User supply(String name);
}