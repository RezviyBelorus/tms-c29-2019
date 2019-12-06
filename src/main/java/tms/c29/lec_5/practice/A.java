package tms.c29.lec_5.practice;

import java.io.Serializable;

public interface A extends Cloneable, Serializable {
    static void show() {
        System.out.println("Hi");
    }
}

class AAA implements A {
    static void show() {
        System.out.println("YO");
    }
}

class Main {
    public static void main(String[] args) {
        AAA.show();
    }
}