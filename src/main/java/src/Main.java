package src;

import src.second_task.HashTable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashTable map = new HashTable();
        map.put(2);
        map.put(2);
        map.put(2);
        map.put(3);
        map.put(14);
        map.put(15);
        System.out.println(map);

        HashTable smap = new HashTable();
        smap.put(3);
        smap.put(2);
        smap.put(2);
        smap.put(3);
        smap.put(14);
        smap.put(15);
        System.out.println(smap);
        System.out.println(map.equals(smap));
    }
}