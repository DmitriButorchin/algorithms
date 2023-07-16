package com.github.dmitributorchin.algorithms.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * <p>
 * Implement the LRUCache class: *
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists.
 * Otherwise, add the key-value pair to the cache.
 * If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * <p>
 * The functions get and put must each run in O(1) average time complexity.
 */
public class LRUCache {
    int capacity;
    Map<Integer, DoubleLinkedNode> cache;
    DoubleLinkedNode left;
    DoubleLinkedNode right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        left = new DoubleLinkedNode();
        right = new DoubleLinkedNode();
        left.next = right;
        right.prev = left;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            var node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }

        return -1;
    }

    private void remove(DoubleLinkedNode node) {
        var prev = node.prev;
        var next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void insert(DoubleLinkedNode node) {
        var prev = right.prev;
        var next = right;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }

        var node = new DoubleLinkedNode(key, value);
        cache.put(key, node);
        insert(node);

        if (cache.size() > capacity) {
            var lru = left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

class DoubleLinkedNode {
    int key;
    int value;
    DoubleLinkedNode next;
    DoubleLinkedNode prev;

    public DoubleLinkedNode() {
    }

    public DoubleLinkedNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
