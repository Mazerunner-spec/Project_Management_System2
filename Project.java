import java.util.Date;
public class Project {
    
   
   
   
   static int projectNumber;
   static String projectName;
   static String buildingType;
   static String physicalAddress;
   static int erfNumber;
   static Double totalFee;
   static Double amountPaid;
   static String deadline;
   static String projectCompleted;
   static Date dateCompleted;
public static Object contractor;
public static Object customer;
 
     // Constructor
    // Project Method
    public Project(int projectNumber, String projectName, String buildingType, String physicalAddress, int erfNumber, Double totalFee,
                    Double amountPaid, String deadline, String projectCompleted,Date dateCompleted) {
       
        Project.projectNumber = projectNumber;
        Project.projectName = projectName;
        Project.buildingType = buildingType;
        Project.physicalAddress = physicalAddress;
        Project.erfNumber = erfNumber;
        Project.totalFee = totalFee;
        Project.amountPaid = amountPaid;
        Project.deadline = deadline;
        Project.projectCompleted = projectCompleted;
        Project.dateCompleted = dateCompleted; // Do I need to create a seperate class?
       
    }

   

	public void setProjectName(String projectName) {
        this.projectName = projectName;
    }      
    public void setDeadline (String deadline) {
        this.deadline = deadline;
    }
    public void setAmountPaid (Double amountPaid) {
        this.amountPaid = amountPaid;
    }
    public void setProjectCompleted(String projectCompleted) {
        this.projectCompleted = projectCompleted;
    }
    public void setDateCompleted (Date dateCompleted ) {
        this.dateCompleted = dateCompleted;
    }
   
    
     //Create a toString method
     
     
    public String toString() {
        String output = "";
        output += "\nProject Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + buildingType;
        output += "\nPhysical Address: " + physicalAddress;
        output += "\nErf Number: " + erfNumber;
        output += "\nTotal Fee: " + totalFee;
        output += "\nAmount Paid: " + amountPaid;
        output += "\nDeadline: " + deadline;
        output += "\nIs Project Completed: " + projectCompleted;
        output += "\nCompleted Date: " + dateCompleted;
        return output;
    }
   
 }  
//public class Poised {

// Attributes
//static int projectNumber;
//static String projectName;
//static String buildingDesign;
//static String physicalAddress;
//static int ERFNumber;
//static float projectTotalFee;
//static float totalToDate;
//static String projectDeadline;

// Poised Method.
//public Poised (int projectNumber, String projectName, String buildingDesign, String physicalAddress,
   //            int ERFNumber, float projectTotalFee, float totalToDate, String projectDeadline){

   // Poised.projectNumber = projectNumber;
  //  Poised.projectName = projectName;
  //  Poised.buildingDesign = buildingDesign;
  //  Poised.physicalAddress = physicalAddress;
  //  Poised.ERFNumber = ERFNumber;
  //  Poised.projectTotalFee = projectTotalFee;
  //  Poised.totalToDate = totalToDate;
  //  Poised.projectDeadline = projectDeadline;
//}

//Output
//@Override
//public String toString() {
  //  String output = "Project Number: " + projectNumber;
  //  output += "\nProject Name: " + projectName;
  //  output += "\nBuilding Design: " + buildingDesign;
  //  output += "\nPhysical Address: " + physicalAddress;
 //   output += "\nERF Number: " + ERFNumber;
 //   output += "\nProject Total Fee: R " + projectTotalFee;
 //   output += "\nTotal amount paid to date: R " + totalToDate;
 //   output += "\nProject Deadline: " + projectDeadline;

  //  return output;
//}

//}

//vee persons uit
//note architect architect.
//note architect architect.