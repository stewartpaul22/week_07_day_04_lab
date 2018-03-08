import Fantasy_Game.Cleric;
import Fantasy_Game.HealingToolType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingToolType healingToolType;

    @Before
    public void setUp() throws Exception {
        cleric = new Cleric("Turami", 80, HealingToolType.POTION);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Turami", cleric.getName());
    }

    @Test
    public void testCanGetHealth() {
        assertEquals(80, cleric.getHealth());
    }

    @Test
    public void testCanGetHealingTool() {
        assertEquals(HealingToolType.POTION, cleric.getHealingToolType());
    }
}
