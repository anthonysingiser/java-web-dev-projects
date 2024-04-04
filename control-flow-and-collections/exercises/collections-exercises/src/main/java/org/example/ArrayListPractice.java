package org.example;

import java.util.ArrayList;
import java.util.Random;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        int counter = 0;
        int sum = 0;

        while(counter < 10){
            numbers.add(rand.nextInt(100));
            counter++;
        }

        for(int j : numbers){
            if(j % 2 == 0) {
                sum += j;
                System.out.println(j);
                System.out.println(sum);
            }
        }

        System.out.println(numbers.toString());
        System.out.println(sum);
    }
}
