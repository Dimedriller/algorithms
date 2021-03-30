package com.dimedriller.algorithms.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthFirstTraversalAlgorithmTest {
    @Test
    public void testTraversalEmptyRoot() {
        TestNode root = new TestNode("root");
        final ArrayList<TestNode> entries = new ArrayList<>();
        DepthFirstTraversalAlgorithm.travers(root, (node, depth) -> entries.add(node));

        assertEquals(1, entries.size());
        assertEquals("root", entries.get(0).getName());
    }

    @Test
    public void testTraversalDepth2() {
        TestNode root = new TestNode("root");
        root.addNode(new TestNode("0"));
        root.addNode(new TestNode("1"));
        root.addNode(new TestNode("2"));
        root.addNode(new TestNode("3"));
        root.addNode(new TestNode("4"));
        root.addNode(new TestNode("5"));

        final ArrayList<TestNode> entries = new ArrayList<>();
        DepthFirstTraversalAlgorithm.travers(root, (node, depth) -> entries.add(node));

        assertEquals(13, entries.size());
        assertEquals("root", entries.get(0).getName());
        assertEquals("0", entries.get(1).getName());
        assertEquals("root", entries.get(2).getName());
        assertEquals("1", entries.get(3).getName());
        assertEquals("root", entries.get(4).getName());
        assertEquals("2", entries.get(5).getName());
        assertEquals("root", entries.get(6).getName());
        assertEquals("3", entries.get(7).getName());
        assertEquals("root", entries.get(8).getName());
        assertEquals("4", entries.get(9).getName());
        assertEquals("root", entries.get(10).getName());
        assertEquals("5", entries.get(11).getName());
        assertEquals("root", entries.get(12).getName());
    }

    @Test
    public void testTraversalVariableDepth() {
//  root - 0
//       - 1
//           - 10
//                - 100
//                - 101
//                - 102
//                      - 1020
//                      - 1021
//                             - 10210
//                             - 10211
//                             - 10212
//                      - 1022
//                      - 1023
//                - 103
//           - 11
//           - 12
//                - 120
//                - 121
//       - 2
//       - 3
//       - 4
//           - 40
//                - 400
//                - 401

        TestNode root = new TestNode("root");
        root.addNode(new TestNode("0"));
        
        TestNode node1 = new TestNode("1");
        root.addNode(node1);

        TestNode node10 = new TestNode("10");
        node1.addNode(node10);

        node10.addNode(new TestNode("100"));
        node10.addNode(new TestNode("101"));

        TestNode node102 = new TestNode("102");
        node10.addNode(node102);

        TestNode node1020 = new TestNode("1020");
        node102.addNode(node1020);

        TestNode node1021 = new TestNode("1021");
        node102.addNode(node1021);

        node1021.addNode(new TestNode("10210"));
        node1021.addNode(new TestNode("10211"));
        node1021.addNode(new TestNode("10212"));

        node102.addNode(new TestNode("1022"));
        node102.addNode(new TestNode("1023"));

        node10.addNode(new TestNode("103"));

        node1.addNode(new TestNode("11"));

        TestNode node12 = new TestNode("12");
        node1.addNode(node12);

        node12.addNode(new TestNode("120"));
        node12.addNode(new TestNode("121"));

        root.addNode(new TestNode("2"));
        root.addNode(new TestNode("3"));

        TestNode node4 = new TestNode("4");
        root.addNode(node4);

        TestNode node40 = new TestNode("40");
        node4.addNode(node40);

        node40.addNode(new TestNode("400"));
        node40.addNode(new TestNode("401"));

        final ArrayList<TestNode> entries = new ArrayList<>();
        DepthFirstTraversalAlgorithm.travers(root, (node, depth) -> entries.add(node));

        assertEquals(49, entries.size());
        assertEquals("root", entries.get(0).getName());
        assertEquals("0", entries.get(1).getName());
        assertEquals("root", entries.get(2).getName());
        assertEquals("1", entries.get(3).getName());
        assertEquals("10", entries.get(4).getName());
        assertEquals("100", entries.get(5).getName());
        assertEquals("10", entries.get(6).getName());
        assertEquals("101", entries.get(7).getName());
        assertEquals("10", entries.get(8).getName());
        assertEquals("102", entries.get(9).getName());
        assertEquals("1020", entries.get(10).getName());
        assertEquals("102", entries.get(11).getName());
        assertEquals("1021", entries.get(12).getName());
        assertEquals("10210", entries.get(13).getName());
        assertEquals("1021", entries.get(14).getName());
        assertEquals("10211", entries.get(15).getName());
        assertEquals("1021", entries.get(16).getName());
        assertEquals("10212", entries.get(17).getName());
        assertEquals("1021", entries.get(18).getName());
        assertEquals("102", entries.get(19).getName());
        assertEquals("1022", entries.get(20).getName());
        assertEquals("102", entries.get(21).getName());
        assertEquals("1023", entries.get(22).getName());
        assertEquals("102", entries.get(23).getName());
        assertEquals("10", entries.get(24).getName());
        assertEquals("103", entries.get(25).getName());
        assertEquals("10", entries.get(26).getName());
        assertEquals("1", entries.get(27).getName());
        assertEquals("11", entries.get(28).getName());
        assertEquals("1", entries.get(29).getName());
        assertEquals("12", entries.get(30).getName());
        assertEquals("120", entries.get(31).getName());
        assertEquals("12", entries.get(32).getName());
        assertEquals("121", entries.get(33).getName());
        assertEquals("12", entries.get(34).getName());
        assertEquals("1", entries.get(35).getName());
        assertEquals("root", entries.get(36).getName());
        assertEquals("2", entries.get(37).getName());
        assertEquals("root", entries.get(38).getName());
        assertEquals("3", entries.get(39).getName());
        assertEquals("root", entries.get(40).getName());
        assertEquals("4", entries.get(41).getName());
        assertEquals("40", entries.get(42).getName());
        assertEquals("400", entries.get(43).getName());
        assertEquals("40", entries.get(44).getName());
        assertEquals("401", entries.get(45).getName());
        assertEquals("40", entries.get(46).getName());
        assertEquals("4", entries.get(47).getName());
        assertEquals("root", entries.get(48).getName());
    }
}