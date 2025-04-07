package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Hospital;
import com.xworkz.afterYudagi.Internal.OnlineHospital;

public class Nimhans {
    public void getSomeHelp(Hospital hospital)
    {
        hospital.admitPatient();
        hospital.conductSurgery();
        hospital.dispenseMedicine();
        hospital.provideCheckup();
        hospital.generateReport();

        if (hospital instanceof OnlineHospital)
        {
            OnlineHospital onlineHospital=(OnlineHospital) hospital;
            onlineHospital.generateBill();
        }
    }
}
