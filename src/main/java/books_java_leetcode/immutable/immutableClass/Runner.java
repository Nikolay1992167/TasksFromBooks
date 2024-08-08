package books_java_leetcode.immutable.immutableClass;

public class Runner {
    public static void main(String[] args) {
        Radius radius = new Radius(0,120);
        Point p = new Point(1.23, 4.12, radius);
        System.out.println("Radius start: "+ p.getRadius().getStart());
        radius.setStart(5);
        System.out.println("Radius start: "+ p.getRadius().getStart());
    }
}
