package model.quest;

import java.io.PrintStream;

/**
 * Created by chenkevin on 6/12/16.
 */
public class SlayDragonQuest implements Quest{
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("embarking on quest to slay dragon ");
    }
}
