package Task2;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String carModel, String carClass, int carWeight, int maxSpeed) {
        super(carModel, carClass, carWeight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("SportCar: модель - " + getCarModel() + ", класс - " + getCarClass() +
                ", вес - " + getCarWeight() + " кг, двигатель мощностью - " + getCarEngine().getPowerEngine() +
                " л.с., производитель двигателя - " + getCarEngine().getEngineManufacturer() + ", максимальная скорость - " + maxSpeed + " км/ч");
    }
}
