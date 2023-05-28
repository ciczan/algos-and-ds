package com.ciczan.algos.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author CiceroZandona
 */
class MergeSortTest {

    @Test
    void mergeSort() {
        int[] array1 = {1, 3, 7, 8};
        int[] sorted = new MergeSort().mergeSort(array1);

        assertArrayEquals(new int[] {1, 3, 7, 8}, sorted);
    }

    @Test
    void mergeSort2() {
        int[] array1 = {4, 5, 2, 6};
        int[] sorted = new MergeSort().mergeSort(array1);

        assertArrayEquals(new int[] {2, 4, 5, 6}, sorted);
    }

    @Test
    void mergeSort3() {
        int[] array1 = {1, 3, 7, 8, 2, 4, 5, 6};
        int[] sorted = new MergeSort().mergeSort(array1);

        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, sorted);
    }
}