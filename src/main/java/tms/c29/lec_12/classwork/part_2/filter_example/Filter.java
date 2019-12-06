package tms.c29.lec_12.classwork.part_2.filter_example;

public interface Filter {
    boolean test(Integer x);
}

class FilterHelper {
    boolean filter(Integer x) {
        return x < 20;
    }

    static boolean staticFilter(Integer x) {
        return x < 20;
    }
}

class FilterMain {
    public static void main(String[] args) {
        Filter filter = integer -> integer < 20;

        FilterHelper filterHelper = new FilterHelper();

        Filter methodRefNonStatic = filterHelper::filter;

        Filter methodRefStatic = FilterHelper::staticFilter;
    }
}