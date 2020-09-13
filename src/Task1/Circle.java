package Task1;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /*
    Площадь круга равна произведению квадрата радиуса на число Пи.
     */
    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
