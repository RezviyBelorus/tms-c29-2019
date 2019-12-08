package tms.c29.lec_17.practice;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import tms.c29.lec_11.classwork.point_5.Book;
import tms.c29.lec_18.classwork.User;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class UserCollect {
    public static void main(String[] args) {
        Book book = new Book("kolobok", "ya", 2019);
        Book book2 = new Book("triller", "ya", 2019);

        List<User> users = List.of(
            new User("login", book, "password", 13),
            new User("login", book, "password", 13),
            new User("login", book2, "password", 13),
            new User("kolobok", book, "password", 13)
        );

        Map<Book, Long> collect = users.stream()
            .map(User::getBook)
            .collect(groupingBy(Function.identity(), counting()));


        System.out.println(collect);
    }
}
