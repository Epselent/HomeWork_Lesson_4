package Task2;

public abstract class Car {
    private String carModel;
    private String carClass;
    private int carWeight;
    private Engine carEngine = new Engine();

    public String getCarModel() {
        return carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public Car(String carModel, String carClass, int carWeight) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.carWeight = carWeight;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

}
