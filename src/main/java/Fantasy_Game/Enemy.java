package Fantasy_Game;

import Behaviours.IFight;

public class Enemy extends Player implements IFight{

    EnemyType enemyType;
    Fighter fighter;


    public Enemy(String name, int health, EnemyType enemyType) {
        super(name, health);
        this.enemyType = enemyType;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }


    @Override
    public void attack(Player player) {
        fighter = (Fighter)player;
        int updatedHealth = player.getHealth() - (this.getEnemyType().getEnemyAttack() - ((Fighter) player).getProtection());
        player.setHealth(updatedHealth);
    }
}
