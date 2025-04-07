package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AISmartMirror;
import com.xworkz.afterYudagi.Internal.SmartMirror;

public class Mirror {
    public void useMirrior(SmartMirror mirror)
    {
        mirror.displayWeather();
        mirror.showNewsHeadlines();
        mirror.analyzeSkinCondition();
        mirror.suggestOutfits();
        mirror.playMusic();

        if (mirror instanceof AISmartMirror)
        {
            AISmartMirror aiSmartMirror=(AISmartMirror) mirror;
            aiSmartMirror.breakit();
        }
    }
}
