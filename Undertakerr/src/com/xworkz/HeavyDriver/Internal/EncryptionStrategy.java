package com.xworkz.HeavyDriver.Internal;

public interface EncryptionStrategy {
    void encrypt();
    void decrypt();
    void generateKey();
}
