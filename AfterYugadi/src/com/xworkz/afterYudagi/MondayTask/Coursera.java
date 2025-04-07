package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.LearningPlatform;
import com.xworkz.afterYudagi.Internal.OnlineLearningPlatform;

public class Coursera {
    public void signUp(LearningPlatform learningPlatform)
    {
        learningPlatform.enrollCourse();
        learningPlatform.watchLecture();
        learningPlatform.takeQuiz();
        learningPlatform.submitAssignment();
        learningPlatform.issueCertificate();

        if (learningPlatform instanceof OnlineLearningPlatform)
        {
            OnlineLearningPlatform onlineLearningPlatform=(OnlineLearningPlatform) learningPlatform;
            onlineLearningPlatform.giveFeedback();
        }
    }
}
