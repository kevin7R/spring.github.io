import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;
import soundsystem.SoundSystemConfig;
import soundsystem.TrackCounter;

import static junit.framework.Assert.assertEquals;

/**
 * Created by chenkevin on 8/3/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class TrackerCounterTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testPlayTrack() {
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(7);
        compactDisc.playTrack(7);

        assertEquals(1,  counter.getPlayCount(1));
        assertEquals(1,  counter.getPlayCount(2));
        assertEquals(4,  counter.getPlayCount(3));
        assertEquals(0,  counter.getPlayCount(4));
        assertEquals(0,  counter.getPlayCount(5));
        assertEquals(0,  counter.getPlayCount(6));
        assertEquals(2,  counter.getPlayCount(7));

    }
}
