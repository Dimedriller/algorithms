package com.dimedriller.algorithms.tree;

import java.util.ArrayList;

public class TestNode implements Node<TestNode> {
    private final String name;
    private final ArrayList<TestNode> nestedNodes = new ArrayList<>();

    public TestNode(String name) {
        this.name = name;
    }

    @Override
    public int nodeCount() {
        return nestedNodes.size();
    }

    @Override
    public TestNode node(int index) {
        return nestedNodes.get(index);
    }

    public String getName() {
        return name;
    }

    public void addNode(TestNode node) {
        nestedNodes.add(node);
    }
}
