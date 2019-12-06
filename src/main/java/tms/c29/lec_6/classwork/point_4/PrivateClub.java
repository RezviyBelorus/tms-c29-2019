package tms.c29.lec_6.classwork.point_4;

public class PrivateClub {
    private final String name;

    public PrivateClub() {
        this("C29");
    }

    private PrivateClub(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrivateClub{" +
                "name='" + name + '\'' +
                '}';
    }
}
