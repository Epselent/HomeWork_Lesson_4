package Task1;

public class Triangle implements Shape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    /*
    Площадь треугольника равна произведению половины основания треугольника (a) на его высоту (h):
    */
    @Override
    public double square() {
        return a * h / 2;
    }
}
