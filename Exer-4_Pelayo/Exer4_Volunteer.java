public class Exer4_Volunteer extends Exer4_AdminUser {
    private String name;

    public Exer4_Volunteer(String name, String specialty, String status) {
        super(name, "Volunteer");
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("VOLUNTEER INFO -> Name: " + name);
    }
}