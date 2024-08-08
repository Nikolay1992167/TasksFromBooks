package books_java_leetcode.immutable.immutableClass;

public final class Point {
    private final double x;
    private final double y;
    private final Radius radius;

    public Point(double x, double y, Radius radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Radius getRadius() {
        return new Radius(this.radius.getStart(), this.radius.getEnd());
    }
}
