package com.dimedriller.algorithms.tree;

import java.util.ArrayList;

public class DepthFirstTraversalAlgorithm {
    public static <T extends Node<T>> void travers(T root, TraversalListener<T> listener) {
        T current = root;
        ArrayList<T> pathChain = new ArrayList<>();
        pathChain.add(current);
        ArrayList<Integer> pathIndices = new ArrayList<>();
        pathIndices.add(-1);
        int depth = 0;
        do {
            listener.onEnterNode(current, depth);
            int nestedNodeCount = current.nodeCount();
            int nextIndex = pathIndices.get(depth) + 1;
            if (nextIndex >= nestedNodeCount) {
                current = pathChain.remove(depth);
                pathIndices.remove(depth);
                depth--;
            } else {
                pathIndices.set(depth, nextIndex);
                pathIndices.add(-1);
                pathChain.add(current);
                current = current.node(nextIndex);
                depth++;
            }

        } while(depth >= 0);
    }
}
