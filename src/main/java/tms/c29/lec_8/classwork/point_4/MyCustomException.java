package tms.c29.lec_8.classwork.point_4;

public class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
