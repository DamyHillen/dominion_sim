package nl.dm_hi.strategies;

import nl.dm_hi.stacks.Deck;
import nl.dm_hi.stacks.Hand;

public interface Strategy {
    public int playTurn(Deck deck, Hand hand);
}
