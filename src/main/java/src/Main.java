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
    }
}