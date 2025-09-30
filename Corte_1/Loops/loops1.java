// Java program to find the sum of positive numbers 
import java.util.Scanner; 
class Loops1 { 
  public static void main(String[] args) { 
    int sum = 0; 
 
    // create an object of Scanner class 
    Scanner input = new Scanner(System.in); 
 
    // take integer input from the user 
    System.out.println("Ingrese número"); 
    int number = input.nextInt(); 
     
    // while loop continues  
    // until entered number is positive 
    while (number >= 0) { 
      // add only positive numbers 
      sum += number; 
 
      System.out.println("Ingrese número"); 
      number = input.nextInt(); 
    } 
     
    System.out.println("Sum = " + sum); 
   
  } 
} 