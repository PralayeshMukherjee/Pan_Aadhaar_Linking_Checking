package Project;

public class Aadhaar {
    private String aadhaarNumber;
    private String name;
    private String fathersName;
    private String address;

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Aadhaar(String aadhaarNumber, String name, String fathersName, String address) {
        this.aadhaarNumber = aadhaarNumber;
        this.name = name;
        this.fathersName = fathersName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "aadhaarNumber='" + aadhaarNumber + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
