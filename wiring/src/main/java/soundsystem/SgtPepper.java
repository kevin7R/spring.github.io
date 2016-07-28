package soundsystem;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by chenkevin on 7/20/16.
 */
@Component("LonelyHeartClub")
//@Named("LonelyHeartClub")
public class SgtPepper implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Heart Club Band";
    private String author = "The Beatles";
    public void play() {
        System.out.println("Play " + title + " by " + author);
    }
}
