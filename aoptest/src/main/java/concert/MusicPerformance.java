package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by chenkevin on 8/3/16.
 */
@Component
public class MusicPerformance implements Performance {
    public void perform() {
        System.out.println("music");
    }
}
