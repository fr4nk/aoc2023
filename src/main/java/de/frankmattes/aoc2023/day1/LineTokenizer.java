package de.frankmattes.aoc2023.day1;

public class LineTokenizer {
    String input;

    LineTokenizer(String input) {
        super();
        this.input = input;
    }

    int[] getAllDigits() {
        int[] allDigits = input.chars().filter((int i) -> {
            return i>=47 && i<= 56;
        }).map((int n) -> { return n-48;} ).toArray() ;
        return allDigits;
    }
}
