package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AITrafficViolationDetection;
import com.xworkz.afterYudagi.Internal.TrafficViolation;

public class TrafficPolice {
    public void check(TrafficViolation violation){
        violation.captureLicensePlates();
        violation.detectSpeeding();
        violation.identifyRedLightViolations();
        violation.issueFines();
        violation.generateViolationReports();

        if (violation instanceof AITrafficViolationDetection)
        {
            AITrafficViolationDetection aiTrafficViolationDetection=(AITrafficViolationDetection) violation;
            aiTrafficViolationDetection.police();
        }
    }
}
