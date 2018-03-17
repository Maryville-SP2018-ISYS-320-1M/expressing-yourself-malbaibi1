/*
   ISYS 320
   Name: Mansour Albaibi
   Date: 3/18/2018
*/

public class ComputePay {
 public static void main(String[] args) {
  int totalHours = 4 + 5 + 8 + 4; 
  double hourlySalary = 8.75;
   
  System.out.println("My total hours worked:");
  System.out.println(totalHours);
  
  System.out.println("My hourly salary:");
  System.out.println("$" + hourlySalary);
  
  System.out.println("My total pay:");
  System.out.println(totalHours * hourlySalary);
 }
}
