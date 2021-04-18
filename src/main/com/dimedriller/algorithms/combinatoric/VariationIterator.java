package com.dimedriller.algorithms.combinatoric;

import java.util.Iterator;

/**
 * Iterator which generates k-permutations of n (https://en.wikipedia.org/wiki/Permutation#k-permutations_of_n)
 * also known as variations
 */
public class VariationIterator implements Iterator<int[]> {
    private final int[] current;
    private final int n;
    private boolean hasMore;

    public VariationIterator(int k, int n) {
        if (k <= 0 || n <= 0) {
            throw new IllegalArgumentException("Wrong (n,k) combination: (" + n + "," + k + ")");
        }

        current = new int[k];
        this.n = n;
        hasMore = true;

        for(int index = 0; index < k; index++) {
            current[index] = 0;
        }
    }

    @Override
    public boolean hasNext() {
        return hasMore;
    }

    private static int findShiftIndex(int[] current, int n) {
        int k = current.length;
        int shiftIndex = k - 1;
        do {
            if (current[shiftIndex] < n - 1) {
                return shiftIndex;
            }
            shiftIndex--;
        } while (shiftIndex >= 0);
        return shiftIndex;
    }

    @Override
    public int[] next() {
        int k = current.length;
        int[] next = new int[k];
        System.arraycopy(current, 0, next, 0, k);

        int shiftIndex = findShiftIndex(current, n);
        if (shiftIndex < 0) {
            hasMore = false;
        } else {
            current[shiftIndex] = current[shiftIndex] + 1;
            for (int index = shiftIndex + 1; index < k; index++) {
                current[index] = 0;
            }
        }

        return next;
    }
}
