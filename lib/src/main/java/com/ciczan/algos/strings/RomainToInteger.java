package com.ciczan.algos.strings;

/**
 *
 * Solution for problem: https://leetcode.com/problems/roman-to-integer/
 * <p>
 *  Still not the best solution.
 * </p>
 * @author CiceroZandona
 */
public class RomainToInteger {

    public int romanToInt(String s) {

        char[] numerals = s.toCharArray();

        int result = 0;


        for (int ii = 0; ii < numerals.length; ii++) {
            char num = numerals[ii];
            switch (num) {
                case 'I':
                    char nextI = next(numerals, ii);
                    if (nextI == 'V'){
                        result += 4;
                        ii++;
                    } else if (nextI == 'X') {
                        result += 9;
                        ii++;
                    } else  result +=1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    char nextX = next(numerals, ii);
                    if (nextX == 'L'){
                        result += 40;
                        ii++;
                    } else if (nextX == 'C') {
                        result += 90;
                        ii++;
                    } else  result +=10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    char nextC = next(numerals, ii);
                    if (nextC == 'D'){
                        result += 400;
                        ii++;
                    } else if (nextC == 'M') {
                        result += 900;
                        ii++;
                    } else  result +=100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown Char");
            }
        }

        return result;
    }

    private char next(char[] numerals, int ii) {
        if ((ii+1) >= numerals.length) return '\0';
        return numerals[ii+1];
    }

}
