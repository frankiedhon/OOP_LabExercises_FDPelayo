public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car("White", "Model S", "Tesla", 2022);
        Car c2 = new Car("Black", "Challenger", "Dodge", 2021);
        Car c3 = new Car("Red", "Supra", "Toyota", 2020);
        Car c4 = new Car("Blue", "Wrangler", "Jeep", 2019);
        Car c5 = new Car("Silver", "A4", "Audi", 2023);
        Car c6 = new Car("Gray", "3 Series", "BMW", 2018);
        Car c7 = new Car("Orange", "Elantra", "Hyundai", 2021);
        Car c8 = new Car("Green", "Leaf", "Nissan", 2022);
        Car c9 = new Car("Yellow", "911", "Porsche", 2023);
        Car c10 = new Car("Purple", "C-Class", "Mercedes-Benz", 2020);

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
        c4.displayInfo();
        c5.displayInfo();
        c6.displayInfo();
        c7.displayInfo();
        c8.displayInfo();
        c9.displayInfo();
        c10.displayInfo();
    }
}