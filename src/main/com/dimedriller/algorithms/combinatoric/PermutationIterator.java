package com.dimedriller.algorithms.combinatoric;

import java.util.Iterator;

/**
 * Iterator which generates permutations (https://en.wikipedia.org/wiki/Permutation)
 */
public class PermutationIterator implements Iterator<int[]> {
    private final int[] current;
    private boolean isEven;
    private boolean hasMore;

    public PermutationIterator(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Wrong permutation size: " + n);
        }
        current = new int[n];

        for(int index = 0; index < n; index++) {
            current[index] = index;
        }

        isEven = true;
        hasMore = true;
    }

    @Override
    public boolean hasNext() {
        return hasMore;
    }

    private static int findSwapIndex(int[] current) {
        for(int index = current.length - 2; index >= 0; index--) {
            if (current[index] < current[index + 1]) {
                return index;
            }
        }
        return -1;
    }

    private static void swap(int[] current, int index1, int index2) {
        int swapValue = current[index2];
        current[index2] = current[index1];
        current[index1] = swapValue;
    }

    private static int findValueIndex(int[] current, int offset, int value) {
        for(int index = offset; index < current.length; index++) {
            if (current[index] == value) {
                return index;
            }
        }
        return -1;
    }

    private static void reverseValues(int[] current, int offset) {
        int n = current.length;
        int count = (n - offset) / 2;
        for(int index = 0; index < count; index++) {
            swap(current, index + offset, n - 1 - index);
        }
    }

    @Override
    public int[] next() {
        int n = current.length;
        int[] next = new int[n];
        System.arraycopy(current, 0, next, 0, n);

        int swapIndex = findSwapIndex(current);
        if (swapIndex < 0) {
            hasMore = false;
        } else {
            if (isEven) {
                swap(current, swapIndex, swapIndex + 1);
            } else {
                int swapValue = current[swapIndex] + 1;
                int valueIndex = findValueIndex(current, swapIndex + 1, swapValue);
                while(valueIndex < 0) {
                    swapValue++;
                    valueIndex = findValueIndex(current, swapIndex + 1, swapValue);
                }
                swap(current, swapIndex, valueIndex);

                reverseValues(current, swapIndex + 1);
            }
        }

        isEven = !isEven;
        return next;
    }
}
