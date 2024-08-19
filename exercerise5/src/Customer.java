public class Customer extends Person {
    private String customerID;
    private String address;
    private String phoneNumber;

    // Constructor
    public Customer(String name, int age, String gender, String customerID, String address, String phoneNumber) {
        super(name, age, gender);
        this.customerID = customerID;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter methods
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer :" +
                "customerID='" + customerID + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' ;
    }
}