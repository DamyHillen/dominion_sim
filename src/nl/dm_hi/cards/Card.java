package nl.dm_hi.cards;

import nl.dm_hi.stacks.Hand;

public abstract class Card {
    protected int worth = 0;
    protected int coins = 0;
    protected int victoryPoints = 0;
    protected String name;

    public void showLoc(){
        System.out.println(this.hashCode());
    }

    public abstract String toString();

    // Are these necessary with a good interface?
    public boolean isAction() { return false; }
    public boolean isCurse() { return false; }
    public boolean isVictory() { return false; }
    public boolean isTreasure() { return false; }

    public int getWorth(){ return worth; }
    public int getCoins() { return coins; }
    public int getVictoryPoints() { return victoryPoints; }
    public String getName() { return name; }

    // Doesn't do anything by default, only for ActionCards
    public void performAction(Hand hand) {}
}
