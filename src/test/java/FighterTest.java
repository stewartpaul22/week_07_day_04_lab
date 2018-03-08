import Fantasy_Game.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FighterTest {

    Fighter fighter;
    WeaponType weaponType;
    FighterType fighterType;
    Enemy enemy;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Gimley", 100, 5, FighterType.DWARF, WeaponType.AXE);
        enemy = new Enemy("Trollie", 100, EnemyType.TROLL);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Gimley", fighter.getName());
    }

    @Test
    public void testCanGetProtection() {
        assertEquals(5, fighter.getProtection());
    }

    @Test
    public void testCanGetHealth() {
        assertEquals(100, fighter.getHealth());
    }

    @Test
    public void testCanGetWeapon() {
        assertEquals(WeaponType.AXE, fighter.getWeaponType());
    }

    @Test
    public void testCanGetFighter() {
        assertEquals(FighterType.DWARF, fighter.getFighterType());
    }

    @Test
    public void testCanChangeWeaponType() {
        assertEquals(WeaponType.SWORD, fighter.changeWeapon(WeaponType.SWORD));
    }

    @Test
    public void testFighterAttacks() {
        fighter.attack(enemy);
        assertEquals(90, enemy.getHealth());
    }
}
