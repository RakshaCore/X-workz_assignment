package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIFakeNewsDetector;
import com.xworkz.afterYudagi.Internal.NewsVerification;

public class News {
    public void checkAuthencity(NewsVerification verification)
    {
        verification.fetchNewsArticles();
        verification.analyzeArticleContent();
        verification.checkSourceCredibility();
        verification.flagFakeNews();
        verification.generateVerificationReports();
        if(verification instanceof AIFakeNewsDetector){
        AIFakeNewsDetector aiFakeNewsDetector=(AIFakeNewsDetector) verification;
        aiFakeNewsDetector.destroy();
        }
    }
}
