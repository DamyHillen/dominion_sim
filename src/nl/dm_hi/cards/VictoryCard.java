package nl.dm_hi.cards;

public class VictoryCard extends Card{
    VictoryCard(int worth, int victoryPoints, String name){
        this.worth = worth;
        this.victoryPoints = victoryPoints;
        this.name = name;
    }
    @Override
    public String toString() {
        return "["+worth+"] "+name+" (+"+victoryPoints+" victory point(s))";
    }

    @Override
    public boolean isVictory() {
        return true;
    }
}
