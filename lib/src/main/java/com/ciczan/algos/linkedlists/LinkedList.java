package com.ciczan.algos.linkedlists;

/**
 * @author CiceroZandona
 */
public class LinkedList {

    Node head = null;
    Node tail = null;
    private int length;

    public LinkedList(int value) {
        head = new Node(value);
        tail = head;
        length = 1;

    }

    public Node getHead() {
        return head;
    }

    public Node get(int pos) {
        if (pos < 0) throw new IllegalArgumentException("Negative position.");
        if (pos > length) return null; //Considering that passed the mark
        var index = 0;
        var temp = getHead();
        while (index < pos) {
            temp = temp.next;
            index ++;
        }
        return temp;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);

        Node leftNode = get(index -1);
        newNode.next = leftNode.next;
        leftNode.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index == 0)
            return removeFirst();
        if (index == length)
            return removeLast();

        Node left = get(index -1);
        Node removed = left.next;
        left.next = removed.next;
        removed.next = null;
        length--;

        return removed;

    }

    public Node removeLast() {
        Node last = tail;
        if (length == 0) throw new IllegalArgumentException("List has no element to remove.");
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        return last;
    }

    public Node removeFirst() {
        if (length == 0) throw new IllegalArgumentException("List has no element to remove.");

        Node first = head;
        length--;

        head = head.next;
        if (head == null) {
            tail = null;
        }

        first.next = null;
        return first;
    }

    public void prepend(int value) {
        Node nn = new Node(value);
        if (getLength() == 0) {
            head = nn;
            tail = nn;
        }
        else {
            nn.next = head;
            head = nn;
        }
        length++;
    }

    public boolean set(int index, int value) {
        Node node = get(index);
        if (node == null) return false;
        node.value = value;
        return true;
    }

    static class Node {
        int value = 0;
        Node next = null;

        Node(int value) {
            this.value = value;
        }

    }

}
