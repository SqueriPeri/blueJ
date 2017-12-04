/*
 * Assignment: calculator.java
 * Ryan Banks
 * 11/30/17
 * Coach Tua'One
 * CP2 Period 1
 * 
 * Ask user for what operation they want to perform on the operands
 * that they will provide next
 */
import java.util.*;
import java.io.*;

public class Calculator
{
    public static void main (String arg[])
    {
        boolean quit = false;
        do
        {
            System.out.println("Make your arithmetic selection from the choices below");
            System.out.println(" Addition");
            System.out.println(" Subtraction");
            System.out.println(" Multiplication");
            System.out.println(" Division\n");
            System.out.print("Your choice? Type \"Quit\"");
            Scanner kbReader = new Scanner(System.in);
            String choice = kbReader.next();
            System.out.print("\nEnter first operand: ");
            double op1 = kbReader.nextDouble();
            System.out.print("\nEnter second operand: ");
            double op2 = kbReader.nextDouble();
            System.out.println("");
            switch (choice)
            {
                case "Addition": //addition
                case "addition":
                        System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
                        break;
                case "Subtraction": //subtraction
                case "subtraction":
                        System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
                        break;
                case "Multiplication": //multiplication
                case "multiplication":
                        System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
                        break;
                case "Division": //division
                        System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
                        break;
                case "Quit":
                case "quit":
                default:
                        System.out.println("Hey dummy, only enter a 1, 2, 3, or 4!");
            }
        }while(!quit);
    }
}
