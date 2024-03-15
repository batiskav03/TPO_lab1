package src.second_task;

import java.util.LinkedList;

public class HashTable {
    //todo: make linkedlist
    private int DEFAULT_CAPACITY = 12;
    private LinkedList<Integer>[] ARRAY;

    public HashTable() {
        ARRAY = new LinkedList[DEFAULT_CAPACITY];
    }

    public HashTable(int capacity) {
        DEFAULT_CAPACITY = capacity;
        ARRAY = new LinkedList[DEFAULT_CAPACITY];
    }

    public int hashFunction(int element) {
        int mod = DEFAULT_CAPACITY + 1;
        return element % mod;
    }

    public boolean delete(int element) {
        final int hash = hashFunction(element);
        LinkedList bucket = ARRAY[hash];
        Integer el = element;
        return bucket.remove(el);
    }

    public boolean find(int element) {
        final int hash = hashFunction(element);
        LinkedList bucket = ARRAY[hash];
        return bucket.contains(element);
    }
    public boolean put(int element) {
        final int hash = hashFunction(element);
        LinkedList bucket = ARRAY[hash];
        return bucket.add(element);
    }


}
