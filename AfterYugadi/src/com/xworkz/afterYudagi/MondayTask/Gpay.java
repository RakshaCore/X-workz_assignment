package com.xworkz.afterYudagi.MondayTask;
import com.xworkz.afterYudagi.Internal.DigitalWallet;
import com.xworkz.afterYudagi.Internal.Wallet;

public class Gpay {
    public void app(Wallet wallet)
    {
        wallet.addMoney();
        wallet.makePayment();
        wallet.checkBalance();
        wallet.viewTransactionHistory();
        wallet.applyDiscounts();

        if(wallet instanceof DigitalWallet)
        {
            DigitalWallet digitalWallet=(DigitalWallet) wallet;
            digitalWallet.requestMoney();
        }
    }
}
