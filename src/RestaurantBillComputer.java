/*
   ISYS 320
   Name: Mansour Albaibi
   Date: 3/18/2018 
*/

public class RestaurantBillComputer {

 public static void main(String[] args) {

   calcTax1();                                                                 //for 15% tax
   calcTax2();                                                                 //for 18% tax
   calcTax3();                                                                 //for 20% tax
 }



  public static void calcTax1(){
            int subTotal=20;
            double taxRate=subTotal*0.05;                                       //formula for tax calculation
            double tipPercentage=subTotal*0.15;                                  //formula for tip calculation
            double total=subTotal+taxRate+tipPercentage;                        //formula for bill calculation
            System.out.print("With a 15% tip your total would be $" + total);   
            System.out.println();                                               //to print a new line   
  }
  
  public static void calcTax2(){
            int subTotal=20;
            double taxRate=subTotal*0.05;                                       //formula for tax calculation
            double tipPercentage=subTotal*0.18;                                 //formula for tip calculation
            double total=subTotal+taxRate+tipPercentage;                        //formula for bill calculation
            System.out.print("With a 18% tip your total would be $" + total);   
            System.out.println();                                               //to print a new line   
  }
  
  public static void calcTax3(){
            int subTotal=20;
            double taxRate=subTotal*0.05;                                       //formula for tax calculation
            double tipPercentage=subTotal*0.2;                                  //formula for tip calculation
            double total=subTotal+taxRate+tipPercentage;                        //formula for bill calculation
            System.out.print("With a 20% tip your total would be $" + total);   
            System.out.println();                                               //to print a new line   
  }
}
