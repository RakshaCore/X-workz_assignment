package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIPersonalDiary;
import com.xworkz.afterYudagi.Internal.PersonalDiary;

public class Diary {
    public void readDiary(PersonalDiary diary)
    {
        diary.writeEntry();
        diary.setReminders();
        diary.analyzeMoodTrends();
        diary.encryptEntries();
        diary.suggestReflections();

        if (diary instanceof AIPersonalDiary)
        {
            AIPersonalDiary aiPersonalDiary=(AIPersonalDiary) diary;
            aiPersonalDiary.rest();
        }
    }
}
