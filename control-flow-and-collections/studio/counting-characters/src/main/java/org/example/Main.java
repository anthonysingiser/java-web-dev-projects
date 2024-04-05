package org.example;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        String sentence = "This is a test for a launchcode studio, it's really cool.";
        char[] letters = sentence.toCharArray();
        int i = 0;
        HashMap<Character, Integer> letterMap = new HashMap<>();

        for (char j : letters){
            if(letterMap.containsKey(j)) {
                letterMap.put(j, letterMap.get(j) + 1);
            } else {
                letterMap.put(j, 1);
            }
        }
        System.out.println(letterMap);
    }
}
