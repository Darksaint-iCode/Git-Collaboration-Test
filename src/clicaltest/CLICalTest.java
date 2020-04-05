/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicaltest;

import java.util.Scanner;

/**
 *
 * @author Ibro Yusuf Ola
 */
public class CLICalTest {

    /**
     * @param args the command line arguments
     */
    static double a,b,c;
    static Scanner perOp = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        Start();
    }
    
//    To accept two numbers and ask the user what operation he wanna performs.  
    private static void Start(){
        Scanner inputObja = new Scanner(System.in);
        
        System.out.println("Welcome User :)");
        System.out.print("Input First number: ");
        
        a = inputObja.nextInt();
        
        System.out.print("\nInput Second number: ");
        
        b = inputObja.nextInt();
        
        System.out.println("\nWhat operation are you willing to Perform User :)");
        System.out.println("Input (1) for Addition");
        System.out.println("Input (2) for Subtraction");
        System.out.println("Input (3) for Multiplication");
        System.out.println("Input (4) for Division");
        System.out.println("Input (5) for Modulus \n");
        
        System.out.print("Input a Number to Perform an Operation User: ");
        
        int sOperation = inputObja.nextInt();
        
        switch(sOperation){
            case 1: perAddition();
                break;
            case 2: perSubtraction();
                break;
            case 3: MultiplyMethod();
                 break;
             case 4: DivideMethod();
                 break;
            case 5: perModulous();
                break;
            default: System.out.println("Invalid Input :(");
        }
        inputObja.close();
    }
    
    //Addition Method
    private static void perAddition() {
        c = a + b;
        System.out.println("\nYour answer is: " + c + "\n");
        System.out.println("Do you wanna perform another Operation?");
        System.out.print("Input 1 for Yes and 2 for No: ");
        
        int perTrans = perOp.nextInt();
        
        if(perTrans == 1){
            System.out.println("");
            Start();
        }else{
            System.exit(0);
        }
        perOp.close();
    }

    //Subtraction Method
    private static void perSubtraction() {
        c = a - b;
        System.out.println("\nYour answer is: " + c + "\n");
        System.out.println("Do you wanna perform another Operation?");
        System.out.print("Input 1 for Yes and 2 for No: ");
        
        int perTrans = perOp.nextInt();
        
        if(perTrans == 1){
            System.out.println("");
            Start();
        }else{
            System.exit(0);
        }
        perOp.close();
    }

    //Modulous Method
    private static void perModulous() {
        c = a % b;
        System.out.println("\nYour answer is: " + c + "\n");
        System.out.println("Do you wanna perform another Operation?");
        System.out.print("Input 1 for Yes and 2 for No: ");
        
        int perTrans = perOp.nextInt();
        
        if(perTrans == 1){
            System.out.println("");
            Start();
        }else{
            System.exit(0);
        }
        perOp.close();
    }
    
    //Multiply method
    private static void MultiplyMethod(){
        c = a * b;
        System.out.println("\nYour answer is: " + c + "\n");
        System.out.println("Do you wanna perform another Operation?");
        System.out.print("Input 1 for Yes and 2 for No: ");
        
        int perTrans = perOp.nextInt();
        
        if(perTrans == 1){
            System.out.println("");
            Start();
        }else{
            System.exit(0);
        }
        perOp.close();
    }
    
    //Multiply method
    private static void DivideMethod(){
        c = a / b;
        System.out.println("\nYour answer is: " + c + "\n");
        System.out.println("Do you wanna perform another Operation?");
        System.out.print("Input 1 for Yes and 2 for No: ");
        
        int perTrans = perOp.nextInt();
        
        if(perTrans == 1){
            System.out.println("");
            Start();
        }else{
            System.exit(0);
        }
        perOp.close();
    }
}
