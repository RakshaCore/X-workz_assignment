package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineTaxFiling;
import com.xworkz.afterYudagi.Internal.TaxFiling;

public class TaxKaao {
    public void Tax(TaxFiling tax)
    {
        tax.collectTaxDetails();
        tax.calculateTax();
        tax.generateTaxReport();
        tax.processPayment();
        tax.fileReturn();
        if (tax instanceof OnlineTaxFiling)
        {
            OnlineTaxFiling onlineTaxFiling=(OnlineTaxFiling)tax;
            onlineTaxFiling.NirmalaBehen();
        }
    }
}
