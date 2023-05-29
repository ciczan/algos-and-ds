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
        //TODO Write
    }

    public void prepend(int value) {
        //TODO Wrtie
    }

    public void insert(int index, int value) {
        //TODO Write
    }

    class Node {
        int value = 0;
        Node next = null;

        Node(int value) {
            this.value = value;
        }

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

}
