package tms.c29.lec_5.classwork.point_2;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractCat siamskiy = new Siamskiy();
        feed(siamskiy);

        Animal cat = new Siamskiy();
//        feed(cat);

        AbstractCat maincoon = new Maincoon("Barsik");
        maincoon = new Maincoon("Simple cat");
        feed(maincoon);
    }

    private static void feed(AbstractCat cat) {
        cat.eat();
    }
}
