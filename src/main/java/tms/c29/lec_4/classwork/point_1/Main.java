package tms.c29.lec_4.classwork.point_1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Egor", 23);
        System.out.println("student class name: " + student.getClassName());
        student.setClassName("B-30");

        System.out.println(student.getAge());
        System.out.println(student.getName());

        System.out.println("==student_2==");
        Student student_2 = new Student("Aleksei", 25);

        System.out.println(student_2.getAge());
        System.out.println(student_2.getName());
        System.out.println("==new age and name==");
        student_2.setAge(24);
        student_2.setName("Alla");

        System.out.println(student_2.getAge());
        System.out.println(student_2.getName());

        System.out.println("student_2 className: " + student_2.getClassName());
    }
}
