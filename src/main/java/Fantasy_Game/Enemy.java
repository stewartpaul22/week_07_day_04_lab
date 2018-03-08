package Fantasy_Game;

public class Enemy extends Player {

    EnemyType enemyType;

    public Enemy(String name, int health, EnemyType enemyType) {
        super(name, health);
        this.enemyType = enemyType;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }
}
