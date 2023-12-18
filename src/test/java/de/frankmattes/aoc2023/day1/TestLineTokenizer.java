package de.frankmattes.aoc2023.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestLineTokenizer {


    @ParameterizedTest
    @CsvSource(delimiter = ';',value = {
        "1abc2; [1, 2]",
        "pqr3stu8vwx; [3, 8]"
        ,"a1b2c3d4e5f; [1, 2, 3, 4, 5]"
        ,"treb7uchet; [7]"
    })
    void testLine_allDigitsFound(String input, String digits) {

        LineTokenizer tokenizer = new LineTokenizer(input); 
        int[] foundDigits = tokenizer.getAllDigits();
        assertNotNull(foundDigits);
        assertEquals(digits, Arrays.asList(foundDigits).toString());
    }

    @ParameterizedTest
    @CsvSource(delimiter = ';',value = {
        "1abc2; [1, 2]",
        "pqr3stu8vwx; [3, 8]"
        ,"a1b2c3d4e5f; [1, 5]"
        ,"treb7uchet; [7, 7]"
    })
    void TestLineTokenizer_FirstAndLastDigit(String input, String firstAndLastDigit) {
        LineTokenizer tokenizer = new LineTokenizer(input); 
     
        int[] digits = tokenizer.getFirstAndLastDigit();
        assertNotNull(digits);
        assertEquals(firstAndLastDigit, Arrays.asList(digits).toString());

    } 

    @ParameterizedTest
    @CsvSource(delimiter = ';',value = {
        "1abc2; 12",
        "pqr3stu8vwx; 38"
        ,"a1b2c3d4e5f; 15"
        ,"treb7uchet; 77"
    })
    void testSumOfLine(String input, int lineSum) {
        LineTokenizer tokenizer = new LineTokenizer(input);
        assertEquals(lineSum, tokenizer.sum());
    }
}
