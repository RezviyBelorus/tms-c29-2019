package tms.c29.lec_4.classwork.point_5;

public class Animal {
    private static Animal animal;

    private Animal() {
    }

    public static Animal getInstance() {
        if (animal == null) {
            animal = new Animal();
        }
        return animal;
    }

//    public static void main(String[] args) {
//        new Animal();
//    }
}
