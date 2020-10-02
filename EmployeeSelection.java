import java.util.Scanner;
import java.util.HashMap;

class EmployeeSelection{

 public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  
  HashMap<String, Double> theEmployees = new HashMap<String, Double>();


  HashMap<String, Double> theOtherEntities = new HashMap<String, Double>();
  theOtherEntities.put("Reviewer", (double) 1);
  theOtherEntities.put("Owner", (double) 2);


 for(int i = 1; i <=5; i++){
   System.out.println("Enter Employee name: ");
   String thePresentEmployee = sc.next();
   theEmployees.put("thePresentEmployee",(double) i);
  
 }
 
  System.out.println("Enter stipulated Amount: ");
  double stipulatedAmount = sc.nextDouble();
  
  System.out.println("Enter chosen Employee name: ");
  String chosenEmployee = sc.next();
  
  double employeeShare = 0.4 * stipulatedAmount;
  theEmployees.put(chosenEmployee, (double) employeeShare);

  double reviewerShare = 0.1 * stipulatedAmount;
  theOtherEntities.put("Reviewer",  reviewerShare); 
  
  double ownerShare = 0.5 * stipulatedAmount;
  theOtherEntities.put("Owner", (double) ownerShare);

  System.out.println("Value for " + chosenEmployee + " is " + theEmployees.get(chosenEmployee));
  System.out.println("Value for the Reviewer is " + theOtherEntities.get("Reviewer"));
  System.out.println("Value for the Owner is " + theOtherEntities.get("Owner"));

 
    
  }  
  

}
