package tms.c29.lec_18.classwork;

import tms.c29.lec_11.classwork.point_5.Book;

public class User {
    private int id;
    private Book book;
    private String login;
    private String password;
    private int age;

    public User(String login, Book book, String password, int age) {
        this.book = book;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", login='" + login + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            '}';
    }
}
