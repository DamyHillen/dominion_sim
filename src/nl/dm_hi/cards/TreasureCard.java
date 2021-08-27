package nl.dm_hi.cards;

public class TreasureCard extends Card{
    TreasureCard(int worth, int coins, String name){
        this.worth = worth;
        this.coins = coins;
        this.name = name;
    };

    @Override
    public String toString(){
        return "["+worth+"] "+name+" (+"+coins+" coin(s))";
    }


    @Override
    public boolean isTreasure() {
        return true;
    }
}
