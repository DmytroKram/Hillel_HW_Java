public class CarProcessor {
    
    public void showBrand(Car[] cars, String brand) {
        for (Car car : cars) {
            if (car.brand.equals(brand.trim())) {
                printCar(car);
            }
        }
    }
   
    public void showYearsOfExploit(Car[] cars, String model, int years) {
        int presentYear = 2020;
        for (Car car : cars) {
            if (car.model.equals(model.trim())) {
                if (presentYear - car.year > years) {
                    printCar(car);
                }
            }
        }
    }
    
    public void showPriceMoreThan(Car[] cars, int yearOfManufacture, double price) {
        for (Car car : cars) {
            if (car.year == yearOfManufacture && car.cost > price) {
                printCar(car);
            }
        }
    }
    
    public void printCar(Car car) {
        System.out.println(car.id + " " + car.brand + " " + car.model + " " + car.year + " " + car.color + " " +
                car.cost + " " + car.registerNumber);
    }
}

