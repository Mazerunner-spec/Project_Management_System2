//public class Architect {
    
   // String archName;
   // String phoneNum;
  //  String archEmail;
  //  String archAddress;

  //  public Architect(String archName,String phoneNum,String archEmail,String archAddress){

   //     this.archName = archName;
   //     this.phoneNum = phoneNum;
   //     this.archEmail = archEmail;
   //     this.archAddress = archAddress;
  //  }

  //  public String getArchName(){
  //      return archName;
 //   }
    
//    public String getPhoneNum(){
  //      return phoneNum;
 //   }

 //   public String getArchEmail(){
 //       return archEmail;
 //   }

 //   public String getArchAddress(){
  //      return archAddress;
   // }

 //   public String toString() {
 //       String output = "Architects: " + archName;
 //       output += "\nPhone Number: " + phoneNum;
//        output += "\nEmail Address: " + archEmail;
//        output += "\nPhysical Address: " + archAddress;

  //      return output;
 //   }
    
//}


public class Architect {
	
	 //Attributes.
    static String name;
    static String surname;
    static int phoneNumber;
    static String email;
    static String physicalAddress;

     // Customer Method
    public Architect (String name, String surname, int phoneNumber, String email, String physicalAddress) {
        Architect.name = name;
        Architect.surname = surname;
        Architect.phoneNumber = phoneNumber;
        Architect.email = email;
        Architect.physicalAddress = physicalAddress;
    }
    // More methods
    public String getArchName(){
        return name;
    }
    public String getArchSurname(){
    	return surname;
    }
    
    public int getArchPhoneNum(){
        return phoneNumber;
    }

    public String getArchEmail(){
        return email;
    }
    public String getArchAddress(){
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
