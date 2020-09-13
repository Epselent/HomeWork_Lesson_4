package Task1;

public class Rectangle implements Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /*
        Площадь прямоугольника равна произведению его длины (a) на ширину (b).
         */
    @Override
    public double square() {
        return a * b;
    }
}
