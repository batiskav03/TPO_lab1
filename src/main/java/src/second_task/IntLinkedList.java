package src.second_task;

public class IntLinkedList {

    private int size = 0;

    private Node firstNode;

    private Node lastNode;

    private boolean add(Integer element) {
        if (element == null) return false;
        if (size == 0) {
            firstNode = new Node(element, null);
            lastNode = firstNode;
        } else {
            Node newNode = new Node(element, null);
            lastNode.next = newNode;
            lastNode = newNode;
        }

        size++;
        return true;
    }

    private boolean delete(Integer element) {
        if (element == null) return false;

        Node prev = firstNode;
        Node curr = firstNode.next;
        if (prev.value.equals(element)) {
            firstNode = curr;
        } else {
            while (curr != null) {
                if (curr.value.equals(element)) {
                    prev.next = curr.next;
                    break;
                }
                prev = curr;
                curr = curr.next;
            }

        }

        size--;
        return true;
    }

    private boolean find(Integer element) {
        if (element == null) return false;

        Node curr = firstNode;
        while (curr != null) {
            if (curr.value.equals(element)) return true;

            curr = curr.next;
        }

        return false;
    }


    private class Node {
        Integer value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }


}
