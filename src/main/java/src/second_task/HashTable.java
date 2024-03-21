package src.second_task;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {
    //todo: make linkedlist
    private int DEFAULT_CAPACITY = 12;
    private IntLinkedList[] ARRAY;

    public HashTable() {
        this.ARRAY = new IntLinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            ARRAY[i] = new IntLinkedList();
        }

    }

    public HashTable(int capacity) {
        this.DEFAULT_CAPACITY = capacity;
        this.ARRAY = new IntLinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            ARRAY[i] = new IntLinkedList();
        }
    }

    public int hashFunction(int element) {
        int mod = DEFAULT_CAPACITY;
        return element % mod;
    }

    public boolean delete(int element) {
        final int hash = hashFunction(element);
        IntLinkedList bucket = ARRAY[hash];
        Integer el = element;
        return bucket.delete(el);
    }

    public boolean find(int element) {
        final int hash = hashFunction(element);
        IntLinkedList bucket = ARRAY[hash];
        return bucket.find(element);
    }
    public boolean put(int element) {
        final int hash = hashFunction(element);
        IntLinkedList bucket = ARRAY[hash];
        return bucket.add(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTable hashTable = (HashTable) o;
        if (DEFAULT_CAPACITY != hashTable.DEFAULT_CAPACITY) return false;
        return Arrays.equals(ARRAY, hashTable.ARRAY);
    }

    public IntLinkedList getBucket(int number) {
        return ARRAY[number];
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ARRAY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < DEFAULT_CAPACITY; i++){
            if (ARRAY[i].getSize() == 0) continue;

            sb.append(i);
            sb.append(": ");
            sb.append(ARRAY[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
