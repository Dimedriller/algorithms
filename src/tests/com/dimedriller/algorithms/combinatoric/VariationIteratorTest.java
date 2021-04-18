package com.dimedriller.algorithms.combinatoric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariationIteratorTest {
    @Test
    public void test1k1n() {
        VariationIterator iterator = new VariationIterator(1, 1);
        assertArrayEquals(iterator.next(), new int[] {0});
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test5k1n() {
        VariationIterator iterator = new VariationIterator(5, 1);
        assertArrayEquals(iterator.next(), new int[] {0, 0, 0, 0, 0});
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test1k5n() {
        VariationIterator iterator = new VariationIterator(1, 5);
        assertArrayEquals(iterator.next(), new int[] {0});
        assertArrayEquals(iterator.next(), new int[] {1});
        assertArrayEquals(iterator.next(), new int[] {2});
        assertArrayEquals(iterator.next(), new int[] {3});
        assertArrayEquals(iterator.next(), new int[] {4});
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test3k5n() {
        VariationIterator iterator = new VariationIterator(3, 5);
        assertArrayEquals(iterator.next(), new int[] {0, 0, 0});
        assertArrayEquals(iterator.next(), new int[] {0, 0, 1});
        assertArrayEquals(iterator.next(), new int[] {0, 0, 2});
        assertArrayEquals(iterator.next(), new int[] {0, 0, 3});
        assertArrayEquals(iterator.next(), new int[] {0, 0, 4});
        assertArrayEquals(iterator.next(), new int[] {0, 1, 0});
        assertArrayEquals(iterator.next(), new int[] {0, 1, 1});
        assertArrayEquals(iterator.next(), new int[] {0, 1, 2});
        assertArrayEquals(iterator.next(), new int[] {0, 1, 3});
        assertArrayEquals(iterator.next(), new int[] {0, 1, 4});
        assertArrayEquals(iterator.next(), new int[] {0, 2, 0});
        assertArrayEquals(iterator.next(), new int[] {0, 2, 1});
        assertArrayEquals(iterator.next(), new int[] {0, 2, 2});
        assertArrayEquals(iterator.next(), new int[] {0, 2, 3});
        assertArrayEquals(iterator.next(), new int[] {0, 2, 4});
        assertArrayEquals(iterator.next(), new int[] {0, 3, 0});
        assertArrayEquals(iterator.next(), new int[] {0, 3, 1});
        assertArrayEquals(iterator.next(), new int[] {0, 3, 2});
        assertArrayEquals(iterator.next(), new int[] {0, 3, 3});
        assertArrayEquals(iterator.next(), new int[] {0, 3, 4});
        assertArrayEquals(iterator.next(), new int[] {0, 4, 0});
        assertArrayEquals(iterator.next(), new int[] {0, 4, 1});
        assertArrayEquals(iterator.next(), new int[] {0, 4, 2});
        assertArrayEquals(iterator.next(), new int[] {0, 4, 3});
        assertArrayEquals(iterator.next(), new int[] {0, 4, 4});
        assertArrayEquals(iterator.next(), new int[] {1, 0, 0});
        assertArrayEquals(iterator.next(), new int[] {1, 0, 1});
        assertArrayEquals(iterator.next(), new int[] {1, 0, 2});
        assertArrayEquals(iterator.next(), new int[] {1, 0, 3});
        assertArrayEquals(iterator.next(), new int[] {1, 0, 4});
        assertArrayEquals(iterator.next(), new int[] {1, 1, 0});
        assertArrayEquals(iterator.next(), new int[] {1, 1, 1});
        assertArrayEquals(iterator.next(), new int[] {1, 1, 2});
        assertArrayEquals(iterator.next(), new int[] {1, 1, 3});
        assertArrayEquals(iterator.next(), new int[] {1, 1, 4});
        assertArrayEquals(iterator.next(), new int[] {1, 2, 0});
        assertArrayEquals(iterator.next(), new int[] {1, 2, 1});
        assertArrayEquals(iterator.next(), new int[] {1, 2, 2});
        assertArrayEquals(iterator.next(), new int[] {1, 2, 3});
        assertArrayEquals(iterator.next(), new int[] {1, 2, 4});
        assertArrayEquals(iterator.next(), new int[] {1, 3, 0});
        assertArrayEquals(iterator.next(), new int[] {1, 3, 1});
        assertArrayEquals(iterator.next(), new int[] {1, 3, 2});
        assertArrayEquals(iterator.next(), new int[] {1, 3, 3});
        assertArrayEquals(iterator.next(), new int[] {1, 3, 4});
        assertArrayEquals(iterator.next(), new int[] {1, 4, 0});
        assertArrayEquals(iterator.next(), new int[] {1, 4, 1});
        assertArrayEquals(iterator.next(), new int[] {1, 4, 2});
        assertArrayEquals(iterator.next(), new int[] {1, 4, 3});
        assertArrayEquals(iterator.next(), new int[] {1, 4, 4});
        assertArrayEquals(iterator.next(), new int[] {2, 0, 0});
        assertArrayEquals(iterator.next(), new int[] {2, 0, 1});
        assertArrayEquals(iterator.next(), new int[] {2, 0, 2});
        assertArrayEquals(iterator.next(), new int[] {2, 0, 3});
        assertArrayEquals(iterator.next(), new int[] {2, 0, 4});
        assertArrayEquals(iterator.next(), new int[] {2, 1, 0});
        assertArrayEquals(iterator.next(), new int[] {2, 1, 1});
        assertArrayEquals(iterator.next(), new int[] {2, 1, 2});
        assertArrayEquals(iterator.next(), new int[] {2, 1, 3});
        assertArrayEquals(iterator.next(), new int[] {2, 1, 4});
        assertArrayEquals(iterator.next(), new int[] {2, 2, 0});
        assertArrayEquals(iterator.next(), new int[] {2, 2, 1});
        assertArrayEquals(iterator.next(), new int[] {2, 2, 2});
        assertArrayEquals(iterator.next(), new int[] {2, 2, 3});
        assertArrayEquals(iterator.next(), new int[] {2, 2, 4});
        assertArrayEquals(iterator.next(), new int[] {2, 3, 0});
        assertArrayEquals(iterator.next(), new int[] {2, 3, 1});
        assertArrayEquals(iterator.next(), new int[] {2, 3, 2});
        assertArrayEquals(iterator.next(), new int[] {2, 3, 3});
        assertArrayEquals(iterator.next(), new int[] {2, 3, 4});
        assertArrayEquals(iterator.next(), new int[] {2, 4, 0});
        assertArrayEquals(iterator.next(), new int[] {2, 4, 1});
        assertArrayEquals(iterator.next(), new int[] {2, 4, 2});
        assertArrayEquals(iterator.next(), new int[] {2, 4, 3});
        assertArrayEquals(iterator.next(), new int[] {2, 4, 4});
        assertArrayEquals(iterator.next(), new int[] {3, 0, 0});
        assertArrayEquals(iterator.next(), new int[] {3, 0, 1});
        assertArrayEquals(iterator.next(), new int[] {3, 0, 2});
        assertArrayEquals(iterator.next(), new int[] {3, 0, 3});
        assertArrayEquals(iterator.next(), new int[] {3, 0, 4});
        assertArrayEquals(iterator.next(), new int[] {3, 1, 0});
        assertArrayEquals(iterator.next(), new int[] {3, 1, 1});
        assertArrayEquals(iterator.next(), new int[] {3, 1, 2});
        assertArrayEquals(iterator.next(), new int[] {3, 1, 3});
        assertArrayEquals(iterator.next(), new int[] {3, 1, 4});
        assertArrayEquals(iterator.next(), new int[] {3, 2, 0});
        assertArrayEquals(iterator.next(), new int[] {3, 2, 1});
        assertArrayEquals(iterator.next(), new int[] {3, 2, 2});
        assertArrayEquals(iterator.next(), new int[] {3, 2, 3});
        assertArrayEquals(iterator.next(), new int[] {3, 2, 4});
        assertArrayEquals(iterator.next(), new int[] {3, 3, 0});
        assertArrayEquals(iterator.next(), new int[] {3, 3, 1});
        assertArrayEquals(iterator.next(), new int[] {3, 3, 2});
        assertArrayEquals(iterator.next(), new int[] {3, 3, 3});
        assertArrayEquals(iterator.next(), new int[] {3, 3, 4});
        assertArrayEquals(iterator.next(), new int[] {3, 4, 0});
        assertArrayEquals(iterator.next(), new int[] {3, 4, 1});
        assertArrayEquals(iterator.next(), new int[] {3, 4, 2});
        assertArrayEquals(iterator.next(), new int[] {3, 4, 3});
        assertArrayEquals(iterator.next(), new int[] {3, 4, 4});
        assertArrayEquals(iterator.next(), new int[] {4, 0, 0});
        assertArrayEquals(iterator.next(), new int[] {4, 0, 1});
        assertArrayEquals(iterator.next(), new int[] {4, 0, 2});
        assertArrayEquals(iterator.next(), new int[] {4, 0, 3});
        assertArrayEquals(iterator.next(), new int[] {4, 0, 4});
        assertArrayEquals(iterator.next(), new int[] {4, 1, 0});
        assertArrayEquals(iterator.next(), new int[] {4, 1, 1});
        assertArrayEquals(iterator.next(), new int[] {4, 1, 2});
        assertArrayEquals(iterator.next(), new int[] {4, 1, 3});
        assertArrayEquals(iterator.next(), new int[] {4, 1, 4});
        assertArrayEquals(iterator.next(), new int[] {4, 2, 0});
        assertArrayEquals(iterator.next(), new int[] {4, 2, 1});
        assertArrayEquals(iterator.next(), new int[] {4, 2, 2});
        assertArrayEquals(iterator.next(), new int[] {4, 2, 3});
        assertArrayEquals(iterator.next(), new int[] {4, 2, 4});
        assertArrayEquals(iterator.next(), new int[] {4, 3, 0});
        assertArrayEquals(iterator.next(), new int[] {4, 3, 1});
        assertArrayEquals(iterator.next(), new int[] {4, 3, 2});
        assertArrayEquals(iterator.next(), new int[] {4, 3, 3});
        assertArrayEquals(iterator.next(), new int[] {4, 3, 4});
        assertArrayEquals(iterator.next(), new int[] {4, 4, 0});
        assertArrayEquals(iterator.next(), new int[] {4, 4, 1});
        assertArrayEquals(iterator.next(), new int[] {4, 4, 2});
        assertArrayEquals(iterator.next(), new int[] {4, 4, 3});
        assertArrayEquals(iterator.next(), new int[] {4, 4, 4});
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test0k5n() {
        assertThrows(IllegalArgumentException.class, () -> new VariationIterator(0, 5));
    }

    @Test
    public void test5k0n() {
        assertThrows(IllegalArgumentException.class, () -> new VariationIterator(5, 0));
    }
}