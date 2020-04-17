package blackjack_final;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Dealer Class - a class that deals with the Dealer's action
 * during his turn.
 * @author by: 2020
 */

public class Dealer extends Person {

	//Constructor
    public Dealer() {
        _name = "Dealer";
    }

    /**
     * A method that decides which action the Dealer should take
     * if he should hit or stay.
     *
     * @return boolean - return type to indicate if the dealer needs
     * to stay or hit
     */
    @Override
    public boolean Hit() {
        if (_total < 16) return true;
        if (_total > 16) return false;
        if (ThreadLocalRandom.current().nextInt(0,2) == 0) return true;
        return false;
    }
}