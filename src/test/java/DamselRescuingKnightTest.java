import mockit.integration.junit4.JMockit;
import model.knights.BraveKnight;
import model.knights.DamselRescuingKnight;
import model.quest.MockQuest;
import model.quest.RescueDamselQuest;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by chenkevin on 6/6/16.
 */
@RunWith(JMockit.class)
public class DamselRescuingKnightTest {
    @Test
    public void embarkOnQuest()
    {
//        DamselRescuingKnight knight = new DamselRescuingKnight();
//        knight.embarkOnQuest();
//
//        BraveKnight knight1 = new BraveKnight(new RescueDamselQuest());
//        knight1.embarkOnQuest();

        BraveKnight knight2 = new BraveKnight(new MockQuest());
        knight2.embarkOnQuest();
    }
}
