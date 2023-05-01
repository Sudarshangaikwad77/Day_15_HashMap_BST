package com.bl.hashTable;

import java.util.LinkedList;

public class MyHashTable {

    LinkedList<MyMapNode>[] buckets;

    public MyHashTable() {
        buckets = new LinkedList[30];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<MyMapNode>();
        }
    }

    public void add(String key) {
        int index = getIndex(key);
        LinkedList<MyMapNode> bucket = buckets[index];

        for (MyMapNode node : bucket) {
            if (node.key.equals(key)) {
                node.value++;
                return;
            }
        }
        bucket.add(new MyMapNode(key, 1));
    }

    public int get(String key) {
        int index = getIndex(key);
        LinkedList<MyMapNode> bucket = buckets[index];

        for (MyMapNode node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return 0;
    }

    private int getIndex(String key) {
        int hashCode = key.toLowerCase().hashCode();
        int index = Math.abs(hashCode % 26);
        return index;
    }
}