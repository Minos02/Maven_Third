package com.bej.maven;

import java.util.Scanner;

public class Calculation {
    public static int addition(int number1,int number2){
        return number1 + number2;
    }
    public static int subtraction(int number1,int number2){
        return number1 - number2;
    }
    public static int multiplication(int number1,int number2){
        if(number1 == 0 || number2 == 0){
            throw new ArithmeticException();
        }
        return number1 * number2;
    }
    public static int division(int number1,int number2){
        if(number1 < number2){
            throw new ArithmeticException();
        }
        return number1 / number2;
    }
    public static void main(String [] args){
        // Stores two numbers
        int num1, num2,result = 0;
        int op;
        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");

        // Take the inputs
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Select the operator 1.addition" +
                "2.subtraction"+
                "3.multiplication"+
                "4.division"
        );
       op=sc.nextInt();

       switch (op){
           case 1: result = addition(num1,num2);
           break;
           case 2: result = subtraction(num1,num2);
               break;
           case 3: result = multiplication(num1,num2);
               break;
           case 4: result = division(num1,num2);
               break;
           default:
               System.out.println("You enter wrong input");
       }
    //    System.out.println(num1 + " " + op + " " + num2
             //   + " = " + result);
        System.out.println("Results: "+ result);

    }


}
