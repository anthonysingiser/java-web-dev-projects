package org.launchcode;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Divide(10, 2); // This should print "The result is: 5"
        //Divide(10, 0); // This should print "Error: Division by zero is not allowed."

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            String student = entry.getKey();
            String fileName = entry.getValue();
            int points = CheckFileExtension(fileName);
            System.out.println(student + " received " + points + " points.");
        }
    }

    public static void Divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException();
            }
            int result = x / y;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static int CheckFileExtension(String fileName) {
        try {
            if (fileName == null || fileName.isEmpty()) {
                throw new InvalidFileException("Error: File name is null or empty.");
            }
            if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }
        } catch (InvalidFileException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}