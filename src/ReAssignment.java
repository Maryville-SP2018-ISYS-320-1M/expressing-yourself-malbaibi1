/*
  	ISYS 320
        Name: Mansour Albaibi
        Date: 3/18/2018
*/


/*
  Your predicted values for variables a, b, and c
 a => a = a + 1 = 5 + 1 = 6        correct
 b => b = b - 1 = 10 - 1 = 9       correct
 c => c = c + a = 10 + 6 = 16      correct
 
  After testing the statements in the main method, indicate above if your predictions were correct.
*/

public class ReAssignment {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
   int a = 5;
   int b = 10;
   int c = b;
   a = a + 1;
   b = b - 1;
   c = c + a;
   System.out.print("a = ");
   System.out.println(a);
   System.out.print("b = ");
   System.out.println(b);
   System.out.print("c = ");
   System.out.println(c);
   b= c % a;
   System.out.print("b = ");
   System.out.println(b);
 }

}
