package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AICyberSecurity;
import com.xworkz.afterYudagi.Internal.CyberSecurity;

public class CyberSecurityCS
{
    public void protect(CyberSecurity security)
    {
        security.monitorNetworkTraffic();
        security.detectThreats();
        security.preventAttacks();
        security.conductVulnerabilityAssessments();
        security.generateSecurityReports();

        if (security instanceof AICyberSecurity)
        {
            AICyberSecurity aiCyberSecurity=(AICyberSecurity) security;
            aiCyberSecurity.rakshakaro();
        }
    }
}
