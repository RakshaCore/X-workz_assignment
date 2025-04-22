package com.xworkz.InterFace.Internal;

public class TransactionImpl implements Transaction {

    @Override
    public void processTransaction() {
        System.out.println("Processing transaction");
    }
}
