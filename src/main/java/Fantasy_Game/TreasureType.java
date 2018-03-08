package Fantasy_Game;

public enum TreasureType {

    GOLD(5),
    GEMS(10);

    private final int treasureValue;

    TreasureType(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public int getTreasureValue() {
        return this.treasureValue;
    }

}
