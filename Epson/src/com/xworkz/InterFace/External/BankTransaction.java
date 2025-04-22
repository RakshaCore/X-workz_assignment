package com.xworkz.InterFace.External;
import com.xworkz.InterFace.Internal.Transaction;
public class BankTransaction {
    private Transaction transaction;

    public BankTransaction(Transaction transaction) {
        this.transaction = transaction;
        System.out.println("Running BankTransaction");
    }

    public void processTransaction() {
        if (this.transaction != null) {
            this.transaction.processTransaction();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
