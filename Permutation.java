
/* A program to compute permutation of two numbers X and Y
   Written by Shina
   
*/

import java.util.Scanner;

public class Permutation{
    public static void main (String []args){

      //importing scanner object
       Scanner input = new Scanner (System.in);

      //Prompt to tell the user to enter a value for x
       System.out.println("Enter a value for x: ");
       int x = input.nextInt();

       //Prompt to tell the user to enter a value for y
       System.out.println("Enter a a value for y: ");
       int y = input.nextInt();

       
      //Subtract y from x and stote it in variable z
       int z = x - y;
       
       int factorialx = 1;

       int factorialy = 1;

       System.out.print("permutation of " + x + " and " + y + " = " );


       do { 
          //multiply factorialx by x, then decreement x, as long as the condition below (while condition) is met 
          factorialx *= x; 
          x--;
       } while(x > 0);

          
       do { 
          //multiply factorialy by z, then decreement z, as long as the condition below (while condition) is met 
          factorialy *= z;
          z--;
       } while(z > 0);


        
       //Print result
       System.out.println(factorialx/factorialy);

            
     
    }

    

}