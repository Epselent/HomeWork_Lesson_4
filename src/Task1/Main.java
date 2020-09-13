package Task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(8, 8);
        shape[1] = new Circle(5);
        shape[2] = new Rectangle(5, 6);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }

    }
}
