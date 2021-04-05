package com.dimedriller.algorithms.combinatoric;

import java.util.Iterator;

public class CombinationIterator implements Iterator<int[]> {
    private final int[] current;
    private final int n;
    private boolean hasMore;

    public CombinationIterator(int k, int n) {
        if (k <= 0 || k > n) {
            throw new IllegalArgumentException("Wrong (n,k) combination: (" + n + "," + k + ")");
        }


        current = new int[k];
        this.n = n;
        hasMore = true;

        for(int index = 0; index < k; index++) {
            current[index] = index;
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
            if (current[shiftIndex] < n - k + shiftIndex) {
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
        if (shiftIndex != -1) {
            int shiftValue = current[shiftIndex] + 1;
            for(int index = 0; index < k - shiftIndex; index++) {
                current[index + shiftIndex] = shiftValue + index;
            }
        }

        hasMore = shiftIndex >= 0;
        return next;
    }
}
