package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIFaceRecognition;
import com.xworkz.afterYudagi.Internal.FaceRecognition;

public class FaceUnlock {
    public void phoneUnlock(FaceRecognition recognition)
    {
        recognition.captureImage();
        recognition.detectFace();
        recognition.compareWithDatabase();
        recognition.grantAccess();
        recognition.logEntry();
        if (recognition instanceof AIFaceRecognition)
        {
            AIFaceRecognition aiFaceRecognition=(AIFaceRecognition) recognition;
            aiFaceRecognition.faceLock();
        }
    }
}
