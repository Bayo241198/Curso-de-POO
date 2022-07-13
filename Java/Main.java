class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.license = "ABC123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "XYZ456";
        car2.driver = "Andrea herrera";
        car.passenger = 3;
        car.printDataCar();
    }
}