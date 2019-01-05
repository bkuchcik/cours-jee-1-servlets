package fr.isima.service;

import java.util.SortedMap;

public class FizzBuzzSet {
    private final SortedMap<Integer, String> sorted;

    FizzBuzzSet(SortedMap<Integer, String> sorted) {
        this.sorted = sorted;
    }

    SortedMap<Integer, String> toMap() {
        return sorted;
    }

    @Override
    public String toString() {
        if (sorted.isEmpty()) {
            return "No fizz buzz !";
        }
        return toMap()
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .reduce("FizzBuzz all !!!! :", (previous, next) -> previous + "\n" + next);
    }
}
