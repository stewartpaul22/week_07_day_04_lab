package Fantasy_Game;

public class Magician extends Player {

    CreatureType creature;
    SpellType spell;
    MagicianType magicianType;

    public Magician(String name, int health, CreatureType creature, SpellType spell, MagicianType magicianType) {
        super(name, health);
        this.creature = creature;
        this.spell = spell;
        this.magicianType = magicianType;
    }

    public CreatureType getCreature() {
        return creature;
    }

    public SpellType getSpell() {
        return spell;
    }

    public MagicianType getMagicianType() {
        return magicianType;
    }
}
