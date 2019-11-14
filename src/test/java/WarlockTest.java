import enemys.Enemy;
import enemys.Orc;
import org.junit.Before;
import org.junit.Test;
import players.mages.Mage;
import players.mages.Warlock;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {

    Mage warlock;
    Enemy orc;

    @Before
    public void before(){
        warlock = new Warlock("Fred");
        orc = new Orc("Kenny Russel");
    }

    @Test
    public void canCastSpell() {
        warlock.cast(orc);
        assertEquals(68, orc.getHealth());
    }

    @Test
    public void canDefend() {
        warlock.defend(orc);
        assertEquals(55, orc.getHealth());
    }
}
