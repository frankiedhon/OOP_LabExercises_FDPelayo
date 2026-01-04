public class Volunteer extends AdminUser {
    private String name;

    public Volunteer(String name, String specialty, String status) {
        super(name, "Volunteer");
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("VOLUNTEER INFO -> Name: " + name);
    }
}