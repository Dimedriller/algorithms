package com.dimedriller.algorithms.combinatoric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationIteratorTest {
    @Test
    public void test4n() {
        PermutationIterator iterator = new PermutationIterator(4);
        assertArrayEquals(iterator.next(), new int[] {0, 1, 2, 3});
        assertArrayEquals(iterator.next(), new int[] {0, 1, 3, 2});
        assertArrayEquals(iterator.next(), new int[] {0, 2, 1, 3});
        assertArrayEquals(iterator.next(), new int[] {0, 2, 3, 1});
        assertArrayEquals(iterator.next(), new int[] {0, 3, 1, 2});
        assertArrayEquals(iterator.next(), new int[] {0, 3, 2, 1});
        assertArrayEquals(iterator.next(), new int[] {1, 0, 2, 3});
        assertArrayEquals(iterator.next(), new int[] {1, 0, 3, 2});
        assertArrayEquals(iterator.next(), new int[] {1, 2, 0, 3});
        assertArrayEquals(iterator.next(), new int[] {1, 2, 3, 0});
        assertArrayEquals(iterator.next(), new int[] {1, 3, 0, 2});
        assertArrayEquals(iterator.next(), new int[] {1, 3, 2, 0});
        assertArrayEquals(iterator.next(), new int[] {2, 0, 1, 3});
        assertArrayEquals(iterator.next(), new int[] {2, 0, 3, 1});
        assertArrayEquals(iterator.next(), new int[] {2, 1, 0, 3});
        assertArrayEquals(iterator.next(), new int[] {2, 1, 3, 0});
        assertArrayEquals(iterator.next(), new int[] {2, 3, 0, 1});
        assertArrayEquals(iterator.next(), new int[] {2, 3, 1, 0});
        assertArrayEquals(iterator.next(), new int[] {3, 0, 1, 2});
        assertArrayEquals(iterator.next(), new int[] {3, 0, 2, 1});
        assertArrayEquals(iterator.next(), new int[] {3, 1, 0, 2});
        assertArrayEquals(iterator.next(), new int[] {3, 1, 2, 0});
        assertArrayEquals(iterator.next(), new int[] {3, 2, 0, 1});
        assertArrayEquals(iterator.next(), new int[] {3, 2, 1, 0});
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test10n() {
        PermutationIterator iterator = new PermutationIterator(10);
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
        }

        assertEquals(3628800, counter);
    }

    @Test
    public void test12n() {
        PermutationIterator iterator = new PermutationIterator(12);
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            counter++;
        }

        assertEquals(479001600, counter);
    }
}