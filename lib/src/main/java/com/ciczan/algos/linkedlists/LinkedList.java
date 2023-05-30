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
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        Node last = tail;
        if (length == 0) throw new IllegalArgumentException("List has no element to remove.");
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail ) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
        }
        return last;
    }

    public void prepend(int value) {
        //TODO Wrtie
    }

    public void insert(int index, int value) {
        //TODO Write
    }

    static class Node {
        int value = 0;
        Node next = null;

        Node(int value) {
            this.value = value;
        }

    }

}
