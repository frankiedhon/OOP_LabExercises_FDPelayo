public class Car {
    private String color;
    private String model;
    private String brand;
    private int yearModel;

    // no argument constructor
    public Car() {
        this.color = "No Color";
        this.model = "No Model";
        this.brand = "No Brand";
        this.yearModel = 0;
    }

    // parameterized constructor
    public Car(String color, String model, String brand, int yearModel) {
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.yearModel = yearModel;
    }

    // methods
    public void displayInfo() {
        System.out.println("Color: " + this.color);
        System.out.println("Model: " + this.model);
        System.out.println("Brand: " + this.brand);
        System.out.println("Year Model: " + this.yearModel);
        System.out.println("----------------------------");
    }
}
