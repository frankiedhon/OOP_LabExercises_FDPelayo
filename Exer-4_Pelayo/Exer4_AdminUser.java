public class Exer4_AdminUser {
    protected String username;
    protected String role;

    public Exer4_AdminUser() {
        this.username = "Guest";
        this.role = "General User";
    }

    public Exer4_AdminUser(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println(">>> [Admin System] User: " + username + " | Role: " + role);
    }
}