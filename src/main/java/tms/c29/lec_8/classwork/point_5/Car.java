package tms.c29.lec_8.classwork.point_5;

import tms.c29.lec_8.classwork.point_4.MyCustomException;

public interface Car {
    boolean start() throws MyCustomException;

    boolean stop() throws MyCustomException;
}
