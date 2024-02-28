package org.example;
import java.util.Scanner;

public class UpgradeCalculator {
    private static double operationsum;
    private static boolean isProgramRunning = true;

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        while (isProgramRunning) {
            double firstNum, secondNum, choice, result=0;
            String operation = "";


            System.out.println("Input two integers:");
            System.out.println("First Number : ");
            firstNum = input.nextDouble();
            System.out.println("Second Number : ");
            secondNum = input.nextDouble();

            System.out.println("Choose the operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (x)");
            System.out.println("4. Divide (:)");

            System.out.println("Your Choice : ");
            choice = input.nextDouble();

            switch ((int)choice) {
                case 1:
                    result = firstNum + secondNum;
                    operation = "addition";
                    break;
                case 2:
                    result = firstNum - secondNum;
                    operation = "subtraction";
                    break;
                case 3:
                    result = firstNum * secondNum;
                    operation = "multiplication";
                    break;
                case 4:
                    result = firstNum / secondNum;
                    operation = "divide";
                    break;
                default:
                    System.out.println("Wrong input");
                    isProgramRunning = false;
                    break;
            }
            operationsum += result;
            System.out.println("The " + operation + " result from " + firstNum + " and " + secondNum + " is " + operationsum);
        }
        input.close();
    }
}
