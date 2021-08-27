package nl.dm_hi.strategies;

import nl.dm_hi.stacks.Deck;
import nl.dm_hi.stacks.Hand;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleStrategy implements Strategy {
    Scanner scanner;

    public ConsoleStrategy(){
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int playTurn(Deck deck, Hand hand) {
        String input = "";
        int cardToPlay = -1;

        hand.show();

        do{
            System.out.print(">> ");
            input = scanner.nextLine();

            if(input.equals("done"))
                break;

            try {
                cardToPlay = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                cardToPlay = -1;
            }

            if(cardToPlay >= hand.cardCount())
                cardToPlay = -1;

            if(cardToPlay < 0)
                System.out.println("Input is not a valid card number!");

        } while(cardToPlay < 0);


        return cardToPlay;
    }
}
