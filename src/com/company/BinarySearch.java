package com.company;

import java.util.Optional;


public class BinarySearch {


    public static Optional<Integer> index(int x,int... array) {
        return check(array, x, 0, array.length);
    }

    public static Optional<Integer> check(int[] array, int x, int a, int b) {
        int m = (b + a) / 2;
        if (array[m] == x) {
            return Optional.of(m);
        }
        if (a >= b) {
            return Optional.empty();
        }
        return array[m] > x ? check(array, x, a, m) : check(array, x, m + 1, b);
    }
}
