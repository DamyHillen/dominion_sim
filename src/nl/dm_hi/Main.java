package nl.dm_hi;


import nl.dm_hi.cards.Card;
import nl.dm_hi.cards.PlayingCards;
import nl.dm_hi.stacks.Deck;
import nl.dm_hi.stacks.Hand;
import nl.dm_hi.strategies.ConsoleStrategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Card> cards = startingCards();

        Hand h = new Hand(cards);

        Player p = new Player(new Deck(), h, new ConsoleStrategy(), "ConsolePlayer");
        p.playTurn();
    }

    public static ArrayList<Card> startingCards(){
        ArrayList<Card> cards = new ArrayList<>();
        for(int i = 0; i < 7; i++)
            if(i < 5)
                cards.add(PlayingCards.COPPER);
            else
                cards.add(PlayingCards.ESTATE);

        return cards;
    }
}
