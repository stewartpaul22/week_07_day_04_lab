import Fantasy_Game.Enemy;
import Fantasy_Game.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Trollie", 100, EnemyType.TROLL);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Trollie", enemy.getName());
    }

    @Test
    public void testCanGetHealth() {
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void testCanGetEnemyType() {
        assertEquals(EnemyType.TROLL, enemy.getEnemyType());
    }
}
