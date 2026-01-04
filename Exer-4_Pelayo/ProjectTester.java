import java.util.ArrayList;

public class ProjectTester {
    public static void main(String[] args) {
        // Polymorphism: An ArrayList of the Parent type holding Child objects
        ArrayList<AdminUser> userList = new ArrayList<>();

        userList.add(new Beneficiary("B001", "New York", "123-456", "Food", "Active"));
        userList.add(new Provider("Red Cross", "Training", "0925356"));
        userList.add(new Volunteer("Juan Dela Cruz", "Skills", "Available"));

        System.out.println("--- System Resource Management ---");
        
        // polymorphic behavior: calling the same method name, but different logic runs
        for (AdminUser user : userList) {
            user.displayInfo(); 
        }
    }
}