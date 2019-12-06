package tms.c29.lec_10.classwork.point_1;

public class Account<T, S extends Number> {
    private T id;
    private S sum;

    private String country;

    public <D> Account(T id, S sum, D country) {
        this.id = id;
        this.sum = sum;

        this.country = country.toString();
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum, Class<String> stringClass) {
        int x = 0;
        this.sum = sum;
    }

    public static void main(String[] args) {
        Account<String, Double> accountString = new Account<>("UUID", 1232.0, "USA");
        Account<Integer, Integer> accountInt = new Account<>(123, 650, 777);
        Account<InternalId, Integer> accountInternalId = new Account<>(new InternalId(), 650, 777);

        accountInt.setSum(100, String.class);
        Double sum = accountString.getSum();
        String id = accountString.getId();

        showElem("Hello");
    }

    private static <E> E showElem(E elem) {
        System.out.println(elem.getClass().getName());
        System.out.println(elem);

        return elem;
    }
}

class UserAccount<T, S extends Number, D> extends Account<T, S> {
    public UserAccount(T id, S sum, D country) {
        super(id, sum, country);
    }
}

class InternalId {
    private String name;
}
