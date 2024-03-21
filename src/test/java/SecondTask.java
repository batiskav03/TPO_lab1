import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.second_task.HashTable;
import src.second_task.IntLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SecondTask {

    @Test
    @DisplayName("Ordinary equals insert test")
    void equalsTest() {
        HashTable firstMap = new HashTable();
        firstMap.put(2);
        firstMap.put(2);
        firstMap.put(2);
        firstMap.put(3);
        firstMap.put(14);
        firstMap.put(15);

        HashTable secondMap = new HashTable();
        secondMap.put(2);
        secondMap.put(2);
        secondMap.put(2);
        secondMap.put(3);
        secondMap.put(14);
        secondMap.put(15);

        assertEquals(firstMap, secondMap);

    }

    @Test
    @DisplayName("Check different length hash tables with same inserts")
    void diffLength() {
        HashTable firstMap = new HashTable();
        firstMap.put(2);
        firstMap.put(2);

        HashTable secondMap = new HashTable(15);
        secondMap.put(2);
        secondMap.put(2);

        assertNotEquals(firstMap, secondMap);
    }


    @Test
    @DisplayName("Check hash same result")
    void hashTest() {
        HashTable firstMap = new HashTable();
        HashTable secondMap = new HashTable();
        firstMap.put(12);
        secondMap.put(0);
        int firstBucket = firstMap.getBucket(0).getSize();
        int secondBucket = secondMap.getBucket(0).getSize();

        assertEquals(firstBucket, secondBucket);
    }

    @Test
    @DisplayName("Check delete")
    void checkDelete() {
        HashTable firstMap = new HashTable();
        firstMap.put(2);
        firstMap.put(3);
        firstMap.put(14);
        firstMap.put(15);

        HashTable secondMap = new HashTable();
        secondMap.put(2);
        secondMap.put(14);
        secondMap.put(15);

        boolean result = firstMap.delete(3);

        assertEquals(result, true);

        assertEquals(firstMap, secondMap);
    }

    @Test
    @DisplayName("Check void delete")
    void checkVoidDelete() {
        HashTable firstMap = new HashTable();
        boolean result = firstMap.delete(3);
        assertEquals(result, false);
    }

    @Test
    @DisplayName("Check find")
    void checkFind() {
        HashTable firstMap = new HashTable();
        boolean result = firstMap.find(3);
        assertEquals(result, false);

        firstMap.put(3);
        result = firstMap.find(3);
        assertEquals(result, true);
    }





}
