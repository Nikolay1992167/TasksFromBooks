package books_java_leetcode.sorting_array;

import java.util.Objects;

public class Melon {
    private final String type;
    private final int wight;


    public Melon(String type, int wight) {
        this.type = type;
        this.wight = wight;
    }

    public String getType() {
        return type;
    }

    public int getWight() {
        return wight;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", wight=" + wight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Melon melon = (Melon) o;
        return wight == melon.wight && Objects.equals(type, melon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, wight);
    }
}
