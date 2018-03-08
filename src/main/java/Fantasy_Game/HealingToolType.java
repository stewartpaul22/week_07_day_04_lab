package Fantasy_Game;

public enum HealingToolType {

    POTION(15),
    HERBS(5);

    private final int strength;

    HealingToolType(int strength) { this.strength = strength; }

    public int getStrength() {
        return this.strength;
    }

}
