
import java.util.Scanner;
public class SortNumbers{

    private static Scanner input = new Scanner(System.in);
    public static void main(String []args){


        int[] myInteger = getNumbers(5);//getNumber method is invoked and assing to myInteger variable
        
        int[] sortNumbers = sortArray(myInteger);//myInteger variable is parsed in to sortArray method for sorting and assigned to sortNumbers variable
        
        printSortedNumbers(sortNumbers);// printSortedNumbers method is invoked and sortNumbers variable is parsed to it

    }

    //getNumbers method is use to get input from the user
    public static int[] getNumbers (int array){
        int[] numbers = new int [array];//local variable array is parsed in to an array data type and assigned to variable numbers
        System.out.println("Enter " + array + " int value: ");//Prompt to tell user to enter number of values they want to sort
        for (int i = 0; i < numbers.length; i++){//user input is collected using for loop through scanner
            numbers[i] = input.nextInt();
                
        }
        return numbers;
    }


    //sortArray method is use to to sort numbers entered by the users
    public static int [] sortArray(int [] numbers){
        int [] sortedArray = new int [numbers.length];// new array is created and is set to be equal to the length of number entered by the user
        for (int i = 0; i < numbers.length; i++){//for loop is use to copy the numbers that is been entered by the user to sortedArray variable
            sortedArray[i] = numbers[i]; 
        }
        //return sortedArray[i];

        boolean flag = true;// flag is set to true
        int temp;

        while(flag){
            flag = false; //flag is set to false at the begining of this loop
            for (int i = 0; i < sortedArray.length-1; i++){//for loop is set to iterate at length of number minus 1 (e.g 5-1) entered by user
                if (sortedArray[i] > sortedArray[i+1]){ //A condition to check if sortedArray index 0 is greater than sortedArray index 1
                    temp = sortedArray[i]; //if the condition is true, sortedArray index 0 is stored in temp variable and sortedArray index 1 is
                    sortedArray[i] = sortedArray[i+1]; //stored in sortedArray index 0.
                    sortedArray[i+1] = temp;//Hence temp is swapped with sortedArray index 1
                    flag = true;//if flag is true while loop is executed again
                }
             }//It get to a stage where the numbers are ordered, then the if statement will not be executed as the condition is not met and since
        }//flag is set to false at the begining of the while loop, hence the program escapes from the while loop
        return sortedArray;
    }

    //printSortedNumbers method is use to print the sorted numbers
    public static void printSortedNumbers(int[] array){
        for (int i = 0; i < array.length; i++){//for loop is set to the length of array parse in to it
            System.out.print(array[i] + " ");//then it prints
        }
        
    }
    
}