package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by chenkevin on 7/22/16.
 */
@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc cd;

    public CDPlayer() {
    }

    //@Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public CompactDisc getCd() {
        return cd;
    }
    //@Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
    //@Autowired
    public void insertCD(CompactDisc cd)
    {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
