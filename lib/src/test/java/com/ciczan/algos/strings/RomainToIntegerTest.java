package com.ciczan.algos.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * The tests suggested on Leet Code.
 *
 * @author CiceroZandona
 */
class RomainToIntegerTest {

    @Test
    void test1() {
        int result = new RomainToInteger().romanToInt("III");
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int result = new RomainToInteger().romanToInt("LVIII");
        assertEquals(58, result);
    }

    @Test
    void test3() {
        int result = new RomainToInteger().romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }

}