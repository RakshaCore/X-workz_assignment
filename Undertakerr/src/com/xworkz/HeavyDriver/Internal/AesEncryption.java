package com.xworkz.HeavyDriver.Internal;

public class AesEncryption implements EncryptionStrategy {
    @Override
    public void encrypt() {
        System.out.println("AES Encryption");
    }

    @Override
    public void decrypt() {
        System.out.println("AES Decryption");
    }

    @Override
    public void generateKey() {
        System.out.println("AES Key Generation");
    }
    @Override
    public void logEncryption() {
        System.out.println("Logging AES encryption...");
    }

}
