import enemys.Enemy;
import enemys.Troll;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Barbarian;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Enemy troll;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan");
        troll = new Troll("Bob");
    }

    @Test
    public void canAttack() {
        barbarian.attack(troll);
        assertEquals(95, troll.getHealth());
    }
}
