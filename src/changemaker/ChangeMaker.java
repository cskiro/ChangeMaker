/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changemaker;

import java.util.Scanner;

/**
 * Chapter 2 Tutorial 2
 *
 * @author skiroc
 */
public class ChangeMaker {

    // Constants
    public static final int QUARTER = 25;
    public static final int DIME = 10;
    public static final int NICKEL = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables 
        int originalAmount, amount, quarters, dimes, nickels, pennies;

        // Creating Scanner object
        Scanner kb = new Scanner(System.in);

        // Prompting user to enter amount of change 
        System.out.println("I will find a combination of coins equal "
                + "to the ammount of change entered");

        System.out.println("Enter a whole amount from 1 to 99:");
        amount = kb.nextInt();
        
        originalAmount = amount;

        // Calaculating number of coins and remaining change
        quarters = amount / QUARTER;
        amount = amount % QUARTER;
        dimes = amount / DIME;
        amount = amount % DIME;
        nickels = amount / NICKEL;
        amount = amount % NICKEL;
        pennies = amount;
        
        // Displaying number of coins to user
        System.out.println(originalAmount + " cents in coins can be given as:");
        System.out.println(quarters + " quarters.");
        System.out.println(dimes + " dimes.");
        System.out.println(nickels + " nickels.");
        System.out.println(pennies + " pennies.");
        

    } //end main

} //end class
