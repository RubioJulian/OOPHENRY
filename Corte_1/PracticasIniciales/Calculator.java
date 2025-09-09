/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author Estudiantes
 */
public class Calculator {
    public Calculator(){
        
    }
        public int add(int a, int b){
            return a+b;
        }
        public int substract(int a, int b){
            return a-b;
        
        }
        public int multiply(int a, int b){
            return a*b;
        }
        public double divide(int a, int b){
            return a/b;
        }
         public int modulo(int a, int b){
             return a%b;
         }
                public static void main(String []args){
                    Calculator mycalculator = new Calculator();
                    System.out.println(mycalculator.add(5,7));
                    System.out.println(mycalculator.substract(45,11));
                    System.out.println(mycalculator.multiply(3,2));
                }
    }
    

