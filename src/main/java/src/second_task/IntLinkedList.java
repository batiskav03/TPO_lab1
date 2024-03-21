package src.second_task;

import java.util.Objects;

public class IntLinkedList {

    private int size = 0;

    private Node firstNode;

    private Node lastNode;

    public boolean add(Integer element) {
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

    public boolean delete(Integer element) {
        if (element == null || size == 0) return false;

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

    public boolean find(Integer element) {
        if (element == null || size == 0) return false;

        Node curr = firstNode;
        while (curr != null) {
            if (curr.value.equals(element)) return true;

            curr = curr.next;
        }

        return false;
    }


    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntLinkedList that = (IntLinkedList) o;
        if (that.size != this.size) return false;

        Node currThis = firstNode;
        Node currThat = that.firstNode;
        while (currThis != null) {
            if (!currThat.equals(currThis)) return false;

            currThis = currThis.next;
            currThat = currThat.next;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, firstNode, lastNode);
    }

    @Override
    public String toString() {
        if (firstNode == null) return "[ ]";
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        result.append(firstNode.value);
        Node curr = firstNode.next;
        while (curr != null) {
            result.append(" -> ");
            result.append(curr.value);
            curr = curr.next;
        }
        result.append(" ]");
        return result.toString();
    }

    private class Node {
        Integer value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(value, node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
}
