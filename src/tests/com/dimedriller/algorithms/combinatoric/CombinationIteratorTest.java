package com.dimedriller.algorithms.combinatoric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationIteratorTest {
    @Test
    public void test1k1n() {
        CombinationIterator iterator = new CombinationIterator(1, 1);
        assertArrayEquals(new int[] { 0 }, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test3k4n() {
        CombinationIterator iterator = new CombinationIterator(3, 4);
        assertArrayEquals(new int[] {0, 1, 2}, iterator.next());
        assertArrayEquals(new int[] {0, 1, 3}, iterator.next());
        assertArrayEquals(new int[] {0, 2, 3}, iterator.next());
        assertArrayEquals(new int[] {1, 2, 3}, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test4k4n() {
        CombinationIterator iterator = new CombinationIterator(4, 4);
        assertArrayEquals(new int[] { 0, 1, 2, 3 }, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test6k10n() {
        CombinationIterator iterator = new CombinationIterator(6, 10);
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5}, iterator.next());
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 6}, iterator.next());
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 7}, iterator.next());
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 8}, iterator.next());
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 9}, iterator.next());
        assertArrayEquals(new int[] { 0, 1, 2, 3, 5, 6}, iterator.next());

        int[] current = iterator.next();
        while (current[0] != 3
                && iterator.hasNext()) {
            current = iterator.next();
        }

        assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 8}, current);

        while (iterator.hasNext()) {
            current = iterator.next();
        }

        assertArrayEquals(new int[] { 4, 5, 6, 7, 8, 9}, current);
        assertArrayEquals(new int[] { 4, 5, 6, 7, 8, 9}, iterator.next());
    }

    @Test
    public void test0k5n() {
        assertThrows(IllegalArgumentException.class, () -> new CombinationIterator(0, 5));
    }

    @Test
    public void test5k4n() {
        assertThrows(IllegalArgumentException.class, () -> new CombinationIterator(5, 4));
    }
}