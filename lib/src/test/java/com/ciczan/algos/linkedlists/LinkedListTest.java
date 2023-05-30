package com.ciczan.algos.linkedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author CiceroZandona
 */
class LinkedListTest {

    @Test
    void getHead() {
        LinkedList ll = new LinkedList(45);
        ll.append(46);
        assertEquals(45, ll.getHead().value);
    }

    @Test
    void getTail() {
        LinkedList ll = new LinkedList(45);
        ll.append(46);
        assertEquals(46, ll.getTail().value);
    }

    @Test
    void append() {
        LinkedList ll = new LinkedList(45);
        ll.append(46);
        ll.append(47);

        assertEquals(3, ll.getLength());
        assertEquals(47, ll.getTail().value);
        assertEquals(45, ll.getHead().value);
    }

    @Test
    void removeLast() {

        LinkedList ll = new LinkedList(45);
        ll.append(46);
        ll.append(47);
        ll.append(48);
        ll.append(49);
        ll.append(50);

        LinkedList.Node node = ll.removeLast();

        assertEquals(50, node.value);
        assertEquals(49, ll.getTail().value);
        assertEquals(45, ll.getHead().value);
    }

    @Test
    void removeLastOneElement() {
        LinkedList ll = new LinkedList(45);

        LinkedList.Node node = ll.removeLast();

        assertEquals(45, node.value);
        assertNull(ll.getTail());
        assertNull(ll.head);
        assertEquals(0, ll.getLength());
    }

    @Test
    void removeLastEmpty() {
        LinkedList ll = new LinkedList(45);
        ll.removeLast();
        Exception exception = assertThrows(IllegalArgumentException.class, ll::removeLast);
        assertEquals("List has no element to remove.", exception.getMessage());
    }

}