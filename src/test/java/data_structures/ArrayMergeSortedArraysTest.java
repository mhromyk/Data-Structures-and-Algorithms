package data_structures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayMergeSortedArraysTest {

    @Test
    void mergeSortedArrays() {
        // Given
        int[] array1 = {0,3,4,31};
        int[] array2 = {4,6,30};

        // When
        int[] actualResult = Array.mergeSortedArrays(array1,array2);

        // Then
        assertArrayEquals(new int[] {0,3,4,4,6,30,31}, actualResult);
    }

    @Test
    void mergeSortedArraysReplacedArrays() {
        // Given
        int[] array1 = {0,3,4,31};
        int[] array2 = {4,6,30};

        // When
        int[] actualResult = Array.mergeSortedArrays(array2,array1);

        // Then
        assertArrayEquals(new int[] {0,3,4,4,6,30,31}, actualResult);
    }

    @Test
    void mergeSortedArrays_whenFirstArrayIsEmpty_conerCase01() {
        // Given
        int[] array1 = {};
        int[] array2 = {4,6,30};

        // When
        int[] actualResult = Array.mergeSortedArrays(array1,array2);

        // Then
        assertArrayEquals(array2, actualResult);
    }

    @Test
    void mergeSortedArrays_whenSecondArrayIsEmpty_conerCase02() {
        // Given
        int[] array1 = {0,3,4,31};;
        int[] array2 = {};

        // When
        int[] actualResult = Array.mergeSortedArrays(array1,array2);

        // Then
        assertArrayEquals(array1, actualResult);
    }

    @Test
    void mergeSortedArrays_conerCase03() {
        // Given
        int[] array1 = {0,3,4,31};
        int[] array2 = {4};

        // When
        int[] actualResult = Array.mergeSortedArrays(array2,array1);

        // Then
        assertArrayEquals(new int[] {0,3,4,4,31}, actualResult);
    }

    @Test
    void mergeSortedArrays_conerCase04() {
        // Given
        int[] array1 = {0};
        int[] array2 = {4};

        // When
        int[] actualResult = Array.mergeSortedArrays(array2,array1);

        // Then
        assertArrayEquals(new int[] {0,4}, actualResult);
    }

}