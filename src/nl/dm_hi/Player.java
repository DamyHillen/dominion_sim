package nl.dm_hi;

import nl.dm_hi.stacks.Hand;
import nl.dm_hi.stacks.Deck;
import nl.dm_hi.strategies.Strategy;

public class Player {
    private Strategy strategy;
    private Deck deck;
    private Hand hand;
    private String name;

    public Player(Deck deck, Hand hand, Strategy strategy, String name){
        this.deck = deck;
        this.hand = hand;
        this.strategy = strategy;
        this.name = name;
    }

    public void playTurn() {
        System.out.println(name + " is now playing their turn!"); // TODO: Move this to a future GameHandler class

        int cardPlayed = -1;
        do {
            cardPlayed = strategy.playTurn(deck, hand);

            if(isValidPlay(cardPlayed))
                System.out.println("Playing " + hand.getCard(cardPlayed) + "\n");
            else
                System.out.println("This is not a card you can play!\n");
        } while (cardPlayed >= 0);

        System.out.println(name + " finished their turn!"); // TODO: Move this to a future GameHandler class
    }

    public boolean isValidPlay(int cardIndex){
        if(cardIndex < 0 || cardIndex >= hand.cardCount())
            return false;
        return hand.getCard(cardIndex).isAction() || hand.getCard(cardIndex).isCurse();
    }
}
