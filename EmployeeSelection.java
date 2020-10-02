import java.util.Scanner;
import java.util.HashMap;

class EmployeeSelection{

 public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  
  public HashMap<String, Integer> theEmployees = new HashMap<String, Integer>();


  public HashMap<String, Integer> theOtherEntities = new HashMap<String, Integer>();
  theOtherEntities.put("Reviewer", 1);
  theOtherEntities.put("Owner", 2);


 for(int i = 1; i <=5; i++){
   System.out.println("Enter Employee name: ");
   String thePresentEmployee = sc.getNext();
   theEmployees.put("thePresentEmployee", i);
  
 }
 
  System.out.println("Enter stipulated Amount: ");
  public double stipulatedAmount = sc.nextDouble();
  
  System.out.println("Enter chosen Employee name: ");
  public String chosenEmployee = sc.nextString();

  theEmployees.get(chosenEmployee) = 0.4 * stipulatedAmount;

  theOtherEntities.get("Reviewer") = 0.1 * stipulatedAmount;
  
  theOtherEntities.get("Owner") = 0.5 * stipulatedAmount;

  System.out.println("Value for " + chosenEmployee + " is " + theEmployee.get(chosenEmployee);
  System.out.println("Value for the Reviewer is " + theOtherEntities.get("Reviewer");
  System.out.println("Value for the Owner is " + theOtherEntities.get("Owner");

 
    
  }  
  

}
