public class AdminUser {
    protected String username;
    protected String role;

    public AdminUser() {
        this.username = "Guest";
        this.role = "General User";
    }

    public AdminUser(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println(">>> [Admin System] User: " + username + " | Role: " + role);
    }
}