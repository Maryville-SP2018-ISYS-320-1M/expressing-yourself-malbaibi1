/*
  	ISYS 320
        Name: Mansour Albaibi
        Date: 3/18/2018
*/

/*
  Your predicted values for the expressions
 1. 2+3*4-6 = 2+12-6 = 14-6 = 8                        Correct
 2. 14/7*2+30/5+1 = 2*2+6+1 = 4+6+1 = 11               Correct
 3. (12+6)/3*2 = 18/3*2 = 6*2 = 12                     Correct
 4. (238%10+3)%7 = (8+3)%7 = 11%7 = 4                  Correct
 5. 6*7%4 = 42*4 = 2                                   Correct
 6. 2+2+3+4 = 11                                       Correct
 7. "2+2"+3+4 = ("2+2"+3)+4 = "2+23"+4  = "2+234"      Correct
 8. 3+4+"2+2" = (3+4) +"2+2" = 7+"2+2" = "72+2"        Correct
 
  After testing the expressions in the main method, indicate above if your predictions were correct.
*/

public class TestExpressions {

 public static void main(String[] args) {
  System.out.println("MY_TEST_EXPRESSIONs");
  System.out.print("1: ");
  System.out.println(2+3*4-6);
  System.out.print("2: ");
  System.out.println(14/7*2+30/5+1);
  System.out.print("3: ");
  System.out.println((12+6)/3*2);
  System.out.print("4: ");
  System.out.println((238%10+3)%7);
  System.out.print("5: ");
  System.out.println(6*7%4);
  System.out.print("6: ");
  System.out.println(2+2+3+4);
  System.out.print("7: ");
  System.out.println("2+2"+3+4);
  System.out.print("8: ");
  System.out.println(3+4+"2+2");
 }

}
