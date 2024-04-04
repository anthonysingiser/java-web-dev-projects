package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        String story = "I would not, could not, in a box. I would not, could not with a fox." +
                "I will not eat them in a house." +
                "I will not eat them with a mouse.";

        for (int j : integerArray) {
            if(j % 2 != 0) {
                System.out.println(j);
            }
        }

        String[] sentences = story.split("\\.");

        System.out.println(Arrays.toString(sentences));
    }


}