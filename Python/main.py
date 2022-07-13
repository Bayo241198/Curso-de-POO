from car import Car
if __name__ == "__main__":
    print("hola mundo")
    car = Car()
    car.license = "AMS123"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "QWE123"
    car2.driver = "Andrea herrera"
    print(vars(car2))