package Task2;

public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry("Камаз 65115", "Самосвал", 4500, 1500);
        lorry.getCarEngine().setPowerEngine(600);
        lorry.getCarEngine().setEngineManufacturer("Камаз-750");
        SportCar sportCar = new SportCar("Ferrari 812", "Двухместный СпортКар", 1500, 340);
        sportCar.getCarEngine().setPowerEngine(800);
        sportCar.getCarEngine().setEngineManufacturer("Ferrari");
        sportCar.start();
        sportCar.printInfo();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.stop();
        lorry.start();
        lorry.printInfo();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
    }
}
