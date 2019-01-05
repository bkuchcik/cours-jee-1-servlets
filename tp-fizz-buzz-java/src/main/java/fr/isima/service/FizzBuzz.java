package fr.isima.service;

import java.util.SortedMap;
import java.util.TreeMap;

public class FizzBuzz {


    public String fizzBuzz(int numberToFizz) {
        final StringBuilder fizzBuzzBuilder = new StringBuilder();
        if (numberToFizz % 3 == 0) {
            fizzBuzzBuilder.append("Fizz");
        }
        if (numberToFizz % 5 == 0) {
            fizzBuzzBuilder.append("Buzz");
        }
        if (fizzBuzzBuilder.length() == 0) {
            fizzBuzzBuilder.append(numberToFizz);
        }
        return fizzBuzzBuilder.toString();
    }

    public FizzBuzzSet fizzBuzzAll(int start, int end) {
        final SortedMap<Integer, String> sorted = new TreeMap<>();
        for (int i = start; i <= end; i++) {
            sorted.put(i, fizzBuzz(i));
        }
        return new FizzBuzzSet(sorted);
    }
}
