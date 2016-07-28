import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

/**
 * Created by chenkevin on 7/26/16.
 */
@RunWith(JMockit.class)
public class blankDiscTest {
    @Test
    public void bdTest() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //CompactDisc compactDisc = context.getBean("compactDiscP", CompactDisc.class);
        //compactDisc.play();
        MediaPlayer mediaPlayer = context.getBean("cdPlayer",MediaPlayer.class);
        mediaPlayer.play();
    }
}
