package tms.c29.lec_11.classwork.point_5;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Book book) {
        int nameResult = this.name.compareTo(book.name);
        if (nameResult < 0) {
            return nameResult;
        }

        if (nameResult > 0) {
            return nameResult;
        }

        int authorResult = this.getAuthor().compareTo(book.author);

        if (authorResult < 0) {
            return authorResult;
        }

        if (authorResult > 0) {
            return authorResult;
        }

        return this.year - book.getYear();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name)
            && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            author,
            year);
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", year=" + year +
            '}';
    }
}
