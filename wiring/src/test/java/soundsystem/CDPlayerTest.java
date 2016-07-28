package soundsystem;

import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenkevin on 7/22/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// javaConfig
@ContextConfiguration(classes = CDPlayerConfig.class)

public class CDPlayerTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void playTest()
    {
        cdPlayer.play();
    }


}
