import Fantasy_Game.Fighter;
import Fantasy_Game.FighterType;
import Fantasy_Game.Player;
import Fantasy_Game.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FighterTest {

    Fighter fighter;
    WeaponType weaponType;
    FighterType fighterType;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Gimley", 100, 5, FighterType.DWARF, WeaponType.AXE);
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

}
