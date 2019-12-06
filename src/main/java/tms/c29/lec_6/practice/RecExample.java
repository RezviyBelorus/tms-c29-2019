package tms.c29.lec_6.practice;

/**
 * @author Alexander.Fomin
 * @since October 22, 2019
 */
public class RecExample {
    public static void main(String[] args) {
        helloStackOverFlow("Hello");
    }

    private static String helloStackOverFlow(String s) {
        return helloStackOverFlow(s);
    }
}
