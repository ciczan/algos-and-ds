package com.ciczan.algos.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author CiceroZandona
 */
class MostFrequentItemTest {

    @Test
    void normalArray() {
        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        Integer result = new MostFrequentItem().findMostFrequent(array1);
        assertEquals(1, result);
    }

    @Test
    void normalArray2() {
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        Integer result = new MostFrequentItem().findMostFrequent(array2);
        assertEquals(3, result);
    }

    @Test
    void emptyArray() {
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        Integer result = new MostFrequentItem().findMostFrequent(array3);
        assertNull(result);
    }

    @Test
    void oneElementArray() {
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        Integer result = new MostFrequentItem().findMostFrequent(array4);
        assertEquals(0, result);
    }

    @Test
    void negativeNumbers() {
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        Integer result = new MostFrequentItem().findMostFrequent(array5);
        assertEquals(-1, result);
    }

}