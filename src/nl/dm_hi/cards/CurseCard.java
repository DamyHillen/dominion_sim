package nl.dm_hi.cards;

public class CurseCard extends Card{
    CurseCard(int worth, int victoryPoints, String name){
        this.worth = worth;
        this.victoryPoints = victoryPoints;
        this.name = name;
    }

    @Override
    public String toString() {
        return "["+worth+"] Curse ("+victoryPoints+" victory point(s))";
    }

    @Override
    public boolean isCurse() {
        return true;
    }
}
