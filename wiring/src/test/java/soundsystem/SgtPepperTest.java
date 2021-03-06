package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisc;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by chenkevin on 7/20/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = CDPlayerConfig.class)
public class SgtPepperTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdIsNotNull() {
        assertNotNull(cd);
    }

    @Test
    public void playTest() {
        cd.play();
    }
}
