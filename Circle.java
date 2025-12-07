public class Circle {
    public int radius;
    Point center;
    public Circle(int a, Point b) {
        center = new Point(b.x, b.y);
        radius = a;
    }
}
