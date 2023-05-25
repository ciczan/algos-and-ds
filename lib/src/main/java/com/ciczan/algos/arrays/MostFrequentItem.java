package com.ciczan.algos.arrays;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * Find the most frequently occurring item in an array.
 * Example: The most frequently occurring item in [1, 3, 1, 3, 2, 1] is 1.
 * If you're given an empty array, you should return null (in Java).
 * <br/>
 * You can assume that there is always a single, unique value that appears most frequently
 * unless the array is empty.  For instance, you won't be given an array such as [1, 1, 2, 2].
 *
 * @author CiceroZandona
 */
public class MostFrequentItem {

    public Integer findMostFrequent(int[] arr) {

        Map<Integer, Integer> frequency = new TreeMap<>();
        Integer maxItem = null;
        int maxFrequency = 0;

        for (Integer ii: arr) {
            Integer fr = 1;
            if (frequency.containsKey(ii)) {
                fr = frequency.get(ii);
                fr += 1;
            }
            frequency.put(ii, fr);

            if (fr > maxFrequency) {
                maxItem = ii;
                maxFrequency = fr;
            }
        }
        return maxItem;
    }
}
