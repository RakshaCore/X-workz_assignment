package com.xworkz.HeavyDriver.Internal;

public interface Validator {
    void validate();
    void validateData();
    void validateInput();
    default void logValidation() {
        System.out.println("Logging validation...");
    }
}
