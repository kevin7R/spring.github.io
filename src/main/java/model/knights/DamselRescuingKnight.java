package model.knights;

import model.quest.RescueDamselQuest;

/**
 * Created by chenkevin on 6/6/16.
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest()
    {
        quest.embark();
    }
}
