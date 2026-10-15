import java.lang.*;

public class Variables{
  public static void main(String[] args)
  {
   System.out.println("hello world"); 
   int myNumber = 864; //valid declaration of variable 

   int yourNumber; //valid declaration , keep the memory ready of 4 bytes so that later value can be kept.

   System.out.println(myNumber);
  //  System.out.println(yourNumber);

   boolean isVeg= false;
   System.out.println(isVeg);

  //  float myFloat = 5.0; will give compile error because it thinks that 5.0 is double , therefore need to use f or F after the float number

   float yourFloat =5.0f;

   System.out.println(yourFloat);

   String wishes="Good morning";

   System.out.println(wishes);



  }
}