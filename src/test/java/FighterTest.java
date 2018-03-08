import Fantasy_Game.Fighter;
import Fantasy_Game.FighterType;
import Fantasy_Game.Player;
import Fantasy_Game.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    WeaponType weaponType;
    FighterType fighterType;
    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Fighter("Gimley", 100, 5, FighterType.DWARF, WeaponType.AXE);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Gimley", player.getName());
    }


}
