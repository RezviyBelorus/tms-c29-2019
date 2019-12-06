package tms.c29.lec_12.classwork.part_2;

public class ReturnLambdaExample {
    public static void main(String[] args) {
        Operationable operationable = operationableFabric(1);

        System.out.println(operationable.action(1,2));
    }

    private static Operationable operationableFabric(int operationCase) {
        switch (operationCase) {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x * y;
            case 3:
                return (x, y) -> x - y;
            default:
                return (x, y) -> x / y;
        }
    }
}

interface Operationable {
    Integer action(Integer x, Integer y);
}
