import enemys.Enemy;
import enemys.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.fighters.Dwarf;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

    Enemy orc;
    Player dwarf;

    @Before
    public void before(){
        orc = new Orc("Kenny");
        dwarf = new Dwarf("Willow");
    }

    @Test
    public void canDamage() {
        orc.attack(dwarf);
        assertEquals(55, dwarf.getHealth());
    }
}
