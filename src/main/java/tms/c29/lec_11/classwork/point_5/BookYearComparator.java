package tms.c29.lec_11.classwork.point_5;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book book, Book t1) {
        return t1.getYear() - book.getYear();
    }
}
