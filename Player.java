package blackjack_final;

import java.util.Scanner;

/**
 * Player Class - a class that deals with the Player's actions
 * such as when the player says 'hit' or 'stay'.
 *
 * @author by: 2020
 */

public class Player extends Person {
    private Scanner sc = new Scanner(System.in);;

    //Constructor
    public Player() {
        _name = "You";
    }

    /**
     * A method that accepts and reads the reply of the Player if
     * he hits or stays. Note that this is overridden from the
     * parent class.
     */
    @Override
    public boolean Hit() {
        System.out.print("\nWould you like to 'hit' or 'stay': ");

        do {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("hit")) {
                return true;
            } else if (input.equalsIgnoreCase("stay")) {
                return false;
            } else {
            	System.out.println("You input invalid word!");
                System.out.print("Please type 'hit' or 'stay': ");
            }
        }while (true);
    }
}