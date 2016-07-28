import mockit.integration.junit4.JMockit;
import model.knights.Knight;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenkevin on 7/26/16.
 */
@RunWith(JMockit.class)
public class knightTest {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight =  context.getBean("knight",Knight.class);
        knight.embarkOnQuest();
    }
}
