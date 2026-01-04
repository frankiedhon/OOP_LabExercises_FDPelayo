public class Exer4_Provider extends Exer4_AdminUser {
    private String orgName;

    public Exer4_Provider(String orgName, String service, String contact) {
        super(orgName, "Provider");
        this.orgName = orgName;
    }

    @Override
    public void displayInfo() {
        System.out.println("PROVIDER INFO -> Organization: " + orgName);
    }
}