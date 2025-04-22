package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Currency;

public class ExchangeSystem {
    private Currency currency;
    public ExchangeSystem(Currency currency) {
        this.currency = currency;
        System.out.println("Running ExchangeSystem");
    }
    public void convert() {
        if (this.currency != null) {
            this.currency.convertToINR();
        } else {
            System.err.println("NULLLLL");
        }
    }

}
