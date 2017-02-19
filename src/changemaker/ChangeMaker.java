/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changemaker;

import javax.swing.JOptionPane;

/**
 *
 * @author skiroc
 */
public class ChangeMaker {

    // Constants
    public static final int HALF_DOLLAR = 50;
    public static final int QUARTER = 25;
    public static final int DIME = 10;
    public static final int NICKEL = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables 
        String strAmount;
        int originalAmount, amount, halfDollars, quarters, dimes, nickels, pennies;

        strAmount = JOptionPane.showInputDialog("Enter a whole number from 1 to 99.\n"
                + "I will find a combination of coins equal\n to that amount of change");

        // Creating Scanner object
//        Scanner kb = new Scanner(System.in);

        // Prompting user to enter amount of change 
//        System.out.println("I will find a combination of coins equal "
//                + "to the ammount of change entered");
//
//        System.out.println("Enter a whole amount from 1 to 99:");
//        amount = kb.nextInt();

        amount = Integer.parseInt(strAmount);
        originalAmount = amount;

        // Calaculating number of coins and remaining change
        halfDollars = amount / HALF_DOLLAR;
        amount = amount % HALF_DOLLAR;
        quarters = amount / QUARTER;
        amount = amount % QUARTER;
        dimes = amount / DIME;
        amount = amount % DIME;
        nickels = amount / NICKEL;
        amount = amount % NICKEL;
        pennies = amount;

        // Displaying number of coins to user
//        System.out.println(originalAmount + " cents in coins can be given as:");
//        Systen.out.println(half dollars + " half dollars.");
//        System.out.println(quarters + " quarters.");
//        System.out.println(dimes + " dimes.");
//        System.out.println(nickels + " nickels.");
//        System.out.println(pennies + " pennies.");

        JOptionPane.showMessageDialog(null, originalAmount + 
                " cents in coins can be given as:\n" + halfDollars + 
                " half dollars\n" + quarters + " quarters\n" + dimes + 
                " dimes\n" + nickels + " nickels\n" + pennies + " pennies");

        System.exit(0);
    } //end main

} //end class
