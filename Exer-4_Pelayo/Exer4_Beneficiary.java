public class Exer4_Beneficiary extends Exer4_AdminUser {
    private String iD;
    private String location;

    public Exer4_Beneficiary(String iD, String location, String contact, String type, String status) {
        // Passing relevant data to parent
        super(iD, "Beneficiary"); 
        this.iD = iD;
        this.location = location;
    }

    @Override
    public void displayInfo() {
        System.out.println("BENEFICIARY INFO -> ID: " + iD + " | Location: " + location);
    }
}