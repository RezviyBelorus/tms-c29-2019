package tms.c29.lec_9.classwork.part_2.point_9;

import java.io.Serializable;

public class Work implements Serializable {
    private String workName;

    public Work(String workName) {
        this.workName = workName;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workName='" + workName + '\'' +
                '}';
    }
}
