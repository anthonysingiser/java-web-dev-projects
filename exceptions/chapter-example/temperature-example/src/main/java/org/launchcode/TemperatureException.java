package org.launchcode;

public class TemperatureException {
    // Write code here!
    public static class BelowAbsoluteZeroException extends Exception {
        public BelowAbsoluteZeroException(String message) {
            super(message);
        }
    }
}
