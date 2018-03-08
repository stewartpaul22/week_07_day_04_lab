import Fantasy_Game.CreatureType;
import Fantasy_Game.Magician;
import Fantasy_Game.MagicianType;
import Fantasy_Game.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Magician magician;
    SpellType spell;
    CreatureType creature;

    @Before
    public void setUp() throws Exception {
        magician = new Magician("Gandalf", 90, CreatureType.DRAGON, SpellType.FIREBALL, MagicianType.WIZARD );
    }

    @Test
    public void testCanGetName() {
        assertEquals("Gandalf", magician.getName());
    }

    @Test
    public void testCanGetHealth() {
        assertEquals(90, magician.getHealth());
    }

    @Test
    public void testCanGetCreature() {
        assertEquals(CreatureType.DRAGON, magician.getCreature());
    }

    @Test
    public void testCanGetSpell() {
        assertEquals(SpellType.FIREBALL, magician.getSpell());
    }

    @Test
    public void testCanGetMagicianType() {
        assertEquals(MagicianType.WIZARD, magician.getMagicianType());
    }
}
