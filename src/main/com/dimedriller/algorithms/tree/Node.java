package com.dimedriller.algorithms.tree;

/**
 * This interface represents tree node with nested nodes
 */
public interface Node<T extends Node<T>> {
    /**
     * @return count of nested nodes
     */
    int nodeCount();

    /**
     * @param index - index of nested node
     * @return node by {@code index}
     */
    T node(int index);
}
