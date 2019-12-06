package tms.c29.lec_7.classwork.point_4_5;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Ol");
        StringBuffer stringBuffer = new StringBuffer();

        stringBuilder.append("ga");
        System.out.println(stringBuilder);

        long start = System.currentTimeMillis();
        // your code
        long finish = System.currentTimeMillis();
        System.out.println(finish);

        boolean b = true;
        if (b = false) {

        }

        System.out.println(b);
    }
}
