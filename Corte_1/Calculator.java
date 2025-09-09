
package javaapplication;
import java.util.Scanner;

public class Calculator {
    public Calculator(){
     
    }
        public int add(int D1, int D2){
            return D1+D2;
        }
        public int substract(int D1, int D2){
            return D1-D2;
        
        }
        public int multiply(int D1, int D2){
            return D1*D2;
        }
        public double divide(int D1, int D2){
            return D1/D2;
        }
         public int modulo(int D1, int D2){
             return D1%D2;
         }
                public static void main(String[]args)
                {
                    Scanner entrada = new Scanner(System.in);
                    System.out.print("Escriba la primera variable");
                    int D1 = entrada.nextInt();
                    System.out.print("Escriba la segunda variable");
                    int D2 = entrada.nextInt();
              
                    
                    Calculator mycalculator = new Calculator();
                    System.out.println(mycalculator.add(D1,D2));
                    System.out.println(mycalculator.substract(D1,D2));
                    System.out.println(mycalculator.multiply(D1,D2));
                }
    }
    

