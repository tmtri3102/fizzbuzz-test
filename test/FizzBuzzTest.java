import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    @DisplayName("Fizz case")
    void fizzCase() {
        String expected = "Fizz";
        String result = fizzBuzz.isFizzBuzz(9);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Buzz case")
    void buzzCase() {
        String expected = "Buzz";
        String result = fizzBuzz.isFizzBuzz(10);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("FizzBuzz case")
    void fizzBuzzCase() {
        String expected = "FizzBuzz";
        String result = fizzBuzz.isFizzBuzz(15);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Not FizzBuzz/Fizz/Buzz/Less than 0")
    void notFizzBuzzCase() {
        String expected = "17";
        String result = fizzBuzz.isFizzBuzz(17);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Invalid number")
    void invalidCase() {
        String expected = "Invalid number";
        String result = fizzBuzz.isFizzBuzz(-97);
        assertEquals(expected, result);
    }

}