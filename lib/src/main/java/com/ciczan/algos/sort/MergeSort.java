package com.ciczan.algos.sort;

import java.util.Arrays;

/**
 *
 * From Udemy Course: Java Data Structures & Algorithms + LEETCODE Exercises
 *
 * @author CiceroZandona
 */
public class MergeSort {

    public int[] mergeSort(int[] array) {

        if (array.length == 1) return array;

        int mid = array.length / 2;

        return merge(Arrays.copyOf(array, mid),
                Arrays.copyOfRange(array, mid, array.length));

    }

    private int[] merge(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;
        int ii = 0;
        int jj = 0;
        while (ii < arr1.length && jj < arr2.length) {
            if (arr1[ii] < arr2[jj]) {
                merged[index] = arr1[ii];
                ii++;
            } else {
                merged[index] = arr2[jj];
                jj++;
            }
            index++;
        }
        if (ii < arr1.length)
            System.arraycopy(arr1, ii, merged, index, arr1.length - ii);

        if (jj < arr2.length)
            System.arraycopy(arr2, jj, merged, index, arr2.length - jj);

        return merged;
    }
}
