package model.knights;

import model.quest.Quest;

/**
 * Created by chenkevin on 6/12/16.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }


    public void embarkOnQuest() {
        quest.embark();
    }
}
