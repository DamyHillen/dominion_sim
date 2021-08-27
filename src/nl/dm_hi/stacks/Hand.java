package nl.dm_hi.stacks;

import nl.dm_hi.cards.Card;

import java.util.ArrayList;

public class Hand extends CardStack{
    private ArrayList<Card> cards = new ArrayList<>();

    public Hand(){};

    public Hand(ArrayList<Card> toAdd){
        addCards(toAdd);
    }

    public void addCard(Card toAdd){
        cards.add(toAdd);
    }

    public void addCards(ArrayList<Card> toAdd){
        cards.addAll(toAdd);
    }

    public void clear(){
        cards.clear();
    }

    public void show(){
        this.show(true);
    }

    public void show(boolean extensive){
        System.out.println(cards.size() + (cards.size() != 1 ? " cards" : " card") + " in hand:");
        for(int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            System.out.println("[" + i + "]\t" + (extensive ? c : c.getName()));
        }
    }

    public ArrayList<Integer> getCurseIndices(){
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < cards.size(); i++)
            if(cards.get(i).isCurse())
                indices.add(i);

        return indices;
    }

    public ArrayList<Integer> getTreasureIndices(){
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < cards.size(); i++)
            if(cards.get(i).isTreasure())
                indices.add(i);

        return indices;
    }

    public ArrayList<Integer> getVictoryIndices(){
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < cards.size(); i++)
            if(cards.get(i).isVictory())
                indices.add(i);

        return indices;
    }

    public ArrayList<Integer> getActionIndices(){
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < cards.size(); i++)
            if(cards.get(i).isAction())
                indices.add(i);

        return indices;
    }

    public int getCoins(){
        int coins = 0;

        for(Card card : cards)
            coins += card.getCoins();

        return coins;
    }

    public int cardCount(){
        return this.cards.size();
    }

    public Card getCard(int cardIndex){
        return this.cards.get(cardIndex);
    }
}
