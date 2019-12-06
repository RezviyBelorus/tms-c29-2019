package tms.c29.lec_8.classwork.point_4;

public class CustomExceptionExample {
    public static void main(String[] args) throws MyCustomException {
        int[] ints = {1, 2, 3};

        getElem(ints, 5);
    }

    private static Integer getElem(int[] array, int index) throws MyCustomException {
        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            throw new MyCustomException("Wrong array index", e);
        }
    }
}
