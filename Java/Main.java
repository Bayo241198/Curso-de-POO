class Main {
    public static void main(String[] args) {
        Car car = new Car("ABC123", new Account("Andres Herrera", "7296889"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("XYZ456", new Account("Andrea Herrera", "3553412"));
        car2.passenger = 3;
        car2.printDataCar();
    }
}