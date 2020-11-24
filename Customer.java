public class Customer {
	
    // Attributes.
    static String name;
    static String surname;
    static int phoneNumber;
    static String email;
    static String physicalAddress;

     //Customer Method
    public Customer (String name, String surname, int phoneNumber, String email, String physicalAddress) {
        Customer.name = name;
        Customer.surname = surname;
        Customer.phoneNumber = phoneNumber;
        Customer.email = email;
        Customer.physicalAddress = physicalAddress;
    }
    
	
	// Getter Methods
    public String getCustName(){
        return name;
    }

    public String getCustNum(){
        return surname;
    }

    public int getCustPhone(){
        return phoneNumber;
    }
    public String getCustEmail(){
        return email;
    }
    public String getCustAddress(){
        return physicalAddress;
    }
    // Output
    @Override
	public String toString() {
        String output = "Customer Name: " + name;
        output += "\nCustomer Surname: " + surname;
        output += "\nCustomer Phone Number: " + phoneNumber;
        output += "\nCustomer Email Address: " + email;
        output += "\nCustomer Physical Address: " + physicalAddress;

        return output;
    }

}
