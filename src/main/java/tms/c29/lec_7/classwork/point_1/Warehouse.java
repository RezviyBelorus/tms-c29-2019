package tms.c29.lec_7.classwork.point_1;

public class Warehouse {
    private int cursor;

    private int[] array;

    public Warehouse(int[] array) {
        this.array = array;
    }

    public int next() {
        return array[cursor++];
    }

    public static void main(String[] args) {
        int[] array_1 = {1, 2, 3};
        int[] array_2 = {11, 22, 33};

        Warehouse warehouse_1 = new Warehouse(array_1);
        Warehouse warehouse_2 = new Warehouse(array_2);

        int next_1 = warehouse_1.next();
        int next_2 = warehouse_2.next();

        System.out.println(next_1);
        System.out.println(next_2);

    }
}
