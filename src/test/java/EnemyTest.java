import Fantasy_Game.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;
    Fighter fighter;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Trollie", 100, EnemyType.TROLL);
        fighter = new Fighter("Gimley", 100, 5, FighterType.DWARF, WeaponType.AXE);

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

    @Test
    public void testEnemyAttacks() {
        enemy.attack(fighter);
        assertEquals(85, fighter.getHealth());
    }
}
