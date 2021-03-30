package com.dimedriller.algorithms.tree;

public interface TraversalListener<T extends Node<T>> {
    void onEnterNode(T node, int depth);
}
