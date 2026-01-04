import java.util.ArrayList;

public class Exer4_ProjectTester {
    public static void main(String[] args) {
        // Polymorphism: An ArrayList of the Parent type holding Child objects
        ArrayList<Exer4_AdminUser> userList = new ArrayList<>();

        userList.add(new Exer4_Beneficiary("B001", "New York", "123-456", "Food", "Active"));
        userList.add(new Exer4_Provider("Red Cross", "Training", "0925356"));
        userList.add(new Exer4_Volunteer("Juan Dela Cruz", "Skills", "Available"));

        System.out.println("--- System Resource Management ---");
        
        // polymorphic behavior: calling the same method name, but different logic runs
        for (Exer4_AdminUser user : userList) {
            user.displayInfo(); 
        }
    }
}