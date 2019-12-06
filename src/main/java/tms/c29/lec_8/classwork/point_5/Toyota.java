package tms.c29.lec_8.classwork.point_5;

import tms.c29.lec_8.classwork.point_4.MyCustomException;

public class Toyota implements Car {
    @Override
    public boolean start() throws RuntimeException {
        return false;
    }

    @Override
    public boolean stop() throws MyCustomException {
        return false;
    }
}
