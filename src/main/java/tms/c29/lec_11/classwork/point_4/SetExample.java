package tms.c29.lec_11.classwork.point_4;

import tms.c29.lec_11.classwork.point_3.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        System.out.println(integers);

        Set<Student> students = new HashSet<>();
        students.add(new Student("Alex", 22));
        students.add(new Student("Alex", 20));
        students.add(new Student("Egorka", 23));

        System.out.println(students);




    }
}
