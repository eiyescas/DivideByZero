/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividebyzero;

import java.util.Scanner;

/**
 *
 * @author esmeralda.iyescas001
 */
public class DivideByZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ask a user for a number :int
        //Ask a user for another number :int
        //Try and divide the first number by the second 
        //use a try - catch
        //if there i s an Exception (dividing by zero)
        //print the error
        //use Exception e as the type of Exceptiom
        
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int ans = 0;
        boolean divide = true;
        System.out.println("Enter two numbers you would like to divide");
        System.out.println("Enter the first integer: ");
        a = scan.nextInt();
        System.out.println("Enter the second integer: ");
        b = scan.nextInt();
        
        try{
            ans = a / b;
        }
        catch(Exception e){
            System.out.println("Your input was not valid.");
            System.out.println("You tried to divide by zero.");
            divide = false;
        }
        if(divide){
        System.out.println("Answer = " + ans);
        }
    }
    
}
