package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIEmotionDetection;
import com.xworkz.afterYudagi.Internal.EmotionDetection;

public class EmotionDetectionS {
    public void heartless(EmotionDetection detection)
    {
        detection.analyzeFacialExpressions();
        detection.detectSpeechTone();
        detection.interpretTextSentiment();
        detection.generateEmotionReports();
        detection.suggestMoodImprovement();

        if(detection instanceof AIEmotionDetection)
        {
            AIEmotionDetection aiEmotionDetection=(AIEmotionDetection) detection;
            aiEmotionDetection.plzsleep();
        }
    }
}
