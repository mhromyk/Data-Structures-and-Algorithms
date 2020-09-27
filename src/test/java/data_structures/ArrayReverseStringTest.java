package data_structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayReverseStringTest {

    @Test
    void reverseString_whenInputIsCorrect() {
        // Given
        String input = "This is a test message";
        String expectedResult = "egassem tset a si sihT";

        // When
        String actualResult = Array.reverseString(input);

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseString_whenInputIsOneSymbolLong() {
        // Given
        String input = "T";
        String expectedResult = "T";

        // When
        String actualResult = Array.reverseString(input);

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseString_whenInputIsTwoSymbolsLong() {
        // Given
        String input = "Th";
        String expectedResult = "hT";

        // When
        String actualResult = Array.reverseString(input);

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseString_whenInputIsThreeSymbolsLong() {
        // Given
        String input = "Thi";
        String expectedResult = "ihT";

        // When
        String actualResult = Array.reverseString(input);

        // Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void reverseString_whenInputIsNull() {
        // Given
        String input = null;

        // When / Then
        Assertions.assertNull(Array.reverseString(input));
    }
}