package Fantasy_Game;

public enum EnemyType {

    TROLL(20),
    ORC(25);

    private final int enemyAttack;

    EnemyType(int enemyAttack) { this.enemyAttack = enemyAttack; }

    public int getEnemyAttack() {
        return this.enemyAttack;
    }

}

