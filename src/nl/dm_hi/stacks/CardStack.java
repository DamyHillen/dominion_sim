package nl.dm_hi.stacks;

import nl.dm_hi.cards.Card;

public abstract class CardStack {
    public abstract int cardCount();

    public abstract Card getCard(int cardIndex);
}
