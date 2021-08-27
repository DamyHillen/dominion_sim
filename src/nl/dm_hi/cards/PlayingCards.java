package nl.dm_hi.cards;

public class PlayingCards {
    public static final CurseCard CURSE = new CurseCard(0, -1, "Curse");

    public static final TreasureCard COPPER = new TreasureCard(0, 1, "Copper");
    public static final TreasureCard SILVER = new TreasureCard(3, 2, "Silver");
    public static final TreasureCard GOLD = new TreasureCard(5, 3, "Gold");

    public static final VictoryCard ESTATE = new VictoryCard(2, 1, "Estate");
    public static final VictoryCard DUCHY = new VictoryCard(5, 3, "Duchy");
    public static final VictoryCard PROVINCE = new VictoryCard(8, 6, "Province");

    public static final ActionCard VILLAGE = new ActionCard(3, "Village", "Doesn't do shit atm");
}
