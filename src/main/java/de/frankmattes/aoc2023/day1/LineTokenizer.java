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

    public int[] getFirstAndLastDigit() {

        int[] digits = getAllDigits();
        int[] firstAndLastDigit = new int[] {digits[0], digits[digits.length-1] };
        return firstAndLastDigit;
    }

    public int sum() {
        int[] digits = getFirstAndLastDigit();

        return 10 * digits[0] + digits[1];
    } 
}
