package nl.dm_hi.cards;

public class ActionCard extends Card {
    private final String description;

    public ActionCard(int worth, String name, String description){
        this.worth = worth;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "["+worth+"] "+name+" ("+description+")";
    }

    @Override
    public boolean isAction() {
        return true;
    }
}
