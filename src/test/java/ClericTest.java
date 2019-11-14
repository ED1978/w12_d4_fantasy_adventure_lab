import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.clerics.Cleric;
import players.fighters.Knight;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;
    Player knight;

    @Before
    public void before(){
        cleric = new Cleric("Bartholomew");
        knight = new Knight("Sir Brianne Of Tarth");
    }

    @Test
    public void canHeal() {
        cleric.heal(knight);
        assertEquals(95, knight.getHealth());
    }
}
