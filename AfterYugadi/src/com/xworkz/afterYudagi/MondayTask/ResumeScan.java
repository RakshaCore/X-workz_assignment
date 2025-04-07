package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIResumeScanner;
import com.xworkz.afterYudagi.Internal.ResumeScanner;

public class ResumeScan {
    public void resumeChecker(ResumeScanner scanner)
    {
        scanner.scanResume();
        scanner.extractDetails();
        scanner.rankCandidates();
        scanner.highlightSkills();
        scanner.generateReport();
    if (scanner instanceof AIResumeScanner)
    {
        AIResumeScanner aiResumeScanner=(AIResumeScanner) scanner;
        aiResumeScanner.update();
    }
    }
}
