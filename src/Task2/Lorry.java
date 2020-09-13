package Task2;

public class Lorry extends Car {
    int bodyLiftingCapacity;

    public Lorry(String carModel, String carClass, int carWeight, int bodyLiftingCapacity) {
        super(carModel, carClass, carWeight);
        this.bodyLiftingCapacity = bodyLiftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Грузовик: модель - " + getCarModel() + ", класс - " + getCarClass() +
                ", вес - " + getCarWeight() + " кг, двигатель мощностью - " + getCarEngine().getPowerEngine() +
                " л.с., производитель двигателя - " + getCarEngine().getEngineManufacturer() + ", грузоподъемность кузова - " + bodyLiftingCapacity + " кг");
    }
}
