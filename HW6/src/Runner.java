public class Runner {
    public static void main(String[] args) {

        Car[] cars = new Car[6];
        cars [0] = new Car (1, "BMW", "BMW M4 Coupe", 2010, "Yellow", 23000, "KK 3456");
        cars [1] = new Car (2, "BMW", "Rolls-Royce Cullinan", 2008, "Green", 45780, "KH 4568");
        cars [2] = new Car (3, "Mercedes-Benz", "Mercedes-Benz S500 4matic Coupe Edition 1", 2000, "Blue", 4586, "HI 4589");
        cars [3] = new Car (4, "Mercedes-Benz", "Mercedes-Benz G-klasse", 2011, "Brown", 28638, "IB 2315");
        cars [4] = new Car (5, "Suzuki", "Suzuki Jimny", 2001, "Red", 35690, "IE 4678");
        cars [5] = new Car (6, "Suzuki", "Suzuki Vitare", 2013, "Pink", 40840, "KE 5679");

        CarProcessor6_1 processor = new CarProcessor6_1();

        processor.showBrand(cars, "BMW");
        processor.showYearsOfExploit(cars,"Suzuki Jimny",8);
        processor.showPriceMoreThan(cars, 2010, 20000);
    }
}
