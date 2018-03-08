package Fantasy_Game;

public enum SpellType {

    FIREBALL(10),
    LIGHTNING(10),
    CURSE(5);

    private final int spellDamage;

    SpellType(int spellDamage) { this.spellDamage = spellDamage; }

    public int getSpellDamage() { return this.spellDamage; }

}
