public class Provider extends AdminUser {
    private String orgName;

    public Provider(String orgName, String service, String contact) {
        super(orgName, "Provider");
        this.orgName = orgName;
    }

    @Override
    public void displayInfo() {
        System.out.println("PROVIDER INFO -> Organization: " + orgName);
    }
}