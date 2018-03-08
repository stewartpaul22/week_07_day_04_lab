package Fantasy_Game;

public class Cleric extends Player {

HealingToolType healingToolType;


    public Cleric(String name, int health, HealingToolType healingToolType) {
        super(name, health);
        this.healingToolType = healingToolType;
    }

    public HealingToolType getHealingToolType() {
        return healingToolType;
    }

}
