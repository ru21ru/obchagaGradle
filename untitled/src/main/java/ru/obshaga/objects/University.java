package objects;

import java.util.ArrayList;
import java.util.List;

/*             1. ID

              2.    Название

              3.    Длительность обучения*/
public class University {
    private int id;
    private final String name;
    private final int durationMonths;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public University(String name, int durationMonths) {
        this.name = name;
        this.durationMonths = durationMonths;
    }
    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", durationMonths=" + durationMonths +
                '}';
    }

}
