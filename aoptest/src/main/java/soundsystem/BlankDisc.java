package soundsystem;

import java.util.List;

/**
 * Created by chenkevin on 7/26/16.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String author;
    private List<String> tracks;

    public BlankDisc() {
    }

    public BlankDisc(String title, String author, List<String> tracks) {
        this.title = title;
        this.author = author;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Play " + title + " by " + author);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    public void playTrack(int trackNumber) {
        if (trackNumber < tracks.size()) {
            System.out.println("-Track: " + tracks.get(trackNumber));
        }
    }
}
