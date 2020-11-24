//public class Contractor {

  //  String contName;
  //  String contNum;
  //  String contEmail;
  //  String contAddress;

 //   public Contractor(String contName,String contNum, String contEmail,String contAddress){
        
      //  this.contName = contName;
     //   this.contNum = contNum;
     //   this.contEmail = contEmail;
     //   this.contAddress = contAddress;
  //  }

 //   public String getContName(){
  //      return contName;
 //   }

 //   public String getContNum(){
   //     return contNum;
   // }

  //  public String getContEmail(){
  //      return contEmail;
  //  }

  //  public String getContAddress(){
  //      return contAddress;
  //  }

  //  public String toString(){
  //      String output = "Contractors: " + contName;
   //     output += "\nPhone Number: " + contNum;
   //     output += "\nEmail Address: " + contEmail;
   //     output += "\nPhysical Address: " + contAddress;

   //     return output;
//    }

//}
public class Contractor {
	
    //Attributes.
    static String name;
    static String surname;
    static int phoneNumber;
    static String email;
    static String physicalAddress;
    
    

     //Contractor Method.
    public Contractor (String name, String surname, int phoneNumber, String email, String physicalAddress) {
        Contractor.name = name;
        Contractor.surname = surname;
        Contractor.phoneNumber = phoneNumber;
        Contractor.email = email;
        Contractor.physicalAddress = physicalAddress;
    }
    //More Methods - Getter and Setters
    public String getContName(){
        return name;
    }

    public String getContSurname(){
        return surname;
    }
    public int getContPhoneNum() {
    	return phoneNumber;
    }
    public String getContEmail(){
        return email;
    }
    public String getContAddress(){
        return physicalAddress;
    }
    public int setContNum(int ContNum) {
    	return phoneNumber;
    }
    public String setContEmail(String ContEmail) {
        return email;
}
	//Output
    @Override
public String toString() {
       String output = "Contractor Name: " + name;
       output += "Contractor PhoneNumber: " + phoneNumber;
       output += "\nContractor Email Address: " + email;
       output += "\nContractor Physical Address: " + physicalAddress;

        return output;
    }

}

