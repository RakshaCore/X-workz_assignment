package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.MeditationPlatform;
import com.xworkz.afterYudagi.Internal.OnlineMeditationPlatform;

public class Sadguru {
    public void guideMeditation(MeditationPlatform platform) {
        platform.offerGuidedSessions();
        platform.trackUserProgress();
        platform.provideRelaxingMusic();
        platform.giveBreathingExercises();
        platform.saveUserPreferences();

        if (platform instanceof OnlineMeditationPlatform) {
            OnlineMeditationPlatform online = (OnlineMeditationPlatform) platform;
            online.unlockPremiumFeatures();
        }
    }
}
