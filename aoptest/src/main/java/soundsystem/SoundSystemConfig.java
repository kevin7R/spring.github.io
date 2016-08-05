package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenkevin on 8/3/16.
 */

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class SoundSystemConfig {

    @Bean
    public CompactDisc compactDisc() {
        List<String> list = new ArrayList<String>();

        list.add("Sgt. Pepper's Lonely Hearts Club Band" + " in soundsystem");
        list.add("With a Little Help from My Friends");
        list.add("Lucy in the Sky with Diamonds");
        list.add("Getting Better");
        list.add("Fixing a Hole");

        String title = "Sgt. Pepper's Lonely Hearts Club Band " ;
        String author = "The Beatles";

        return new BlankDisc(title, author, list);
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
