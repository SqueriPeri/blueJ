/*
 * Assignment: calculator.java
 * Ryan Banks
 * 11/30/17
 * Coach Tua'One
 * CP2 Period 1
 * 
 * Ask user for what operation they want (or if they want to quit) to perform on the operands
 * that they will provide next
 */
import java.util.*;
import java.io.*;

public class Calculator
{
    public static void main (String arg[]) 
    {
        boolean quit = false; //loop variable
        do
        {
            System.out.println("Make your arithmetic selection from the choices below");
            System.out.println(" Addition");
            System.out.println(" Subtraction");
            System.out.println(" Multiplication");
            System.out.println(" Division\n");
            System.out.println("Your choice? Type \"Quit\" to end.");
            Scanner kbReader = new Scanner(System.in);
            String choice = kbReader.nextLine();
            switch (choice) //checks choice variable
            {
                case "Quit": //if user wants to quit
                case "quit":
                    System.out.println("Goodbye!");
                    quit = true; //changes loop variable to false (!quit is false) 
                    return; //exits main
                default: //if anything else, moves on to next switch
                    break;
            }
            
            System.out.print("\nEnter first operand: "); //asks for first int
            double op1 = kbReader.nextDouble();
            System.out.print("\nEnter second operand: "); //asks for second int
            double op2 = kbReader.nextDouble();
            System.out.println("");
            switch (choice) //checks choice variable
            {
                case "Addition": //addition
                case "addition":
                        System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2)+"\n");
                        break;
                case "Subtraction": //subtraction
                case "subtraction":
                        System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2)+"\n");
                        break;
                case "Multiplication": //multiplication
                case "multiplication":
                        System.out.println(op1 + " times " + op2 + " = " + (op1 * op2)+"\n");
                        break;
                case "Division": //division
                case "division":
                        System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2)+"\n");
                        break;
                default:
                        System.out.println("Hey dummy, only enter addition, subtraction, multiplication, or division!\n");
            }//end of switch
        }while(!quit);//end of loop
    }//end of main
}//end of class
