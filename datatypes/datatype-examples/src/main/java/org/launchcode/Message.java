package org.launchcode;

public class Message {

    public static String getMessage(String lang) {

        return switch (lang) {
            case "sp" -> "¡Hola, Mundo!";
            case "fr" -> "Bonjour, le monde!";
            case "vi" -> "Chao the gioi";
            case "ge" -> "Hallo Welt";
            default -> "Hello, World!";
        };
    }
}
