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

    @Test
    void removeFirst() {

        LinkedList ll = new LinkedList(45);
        ll.append(46);
        ll.append(47);
        ll.append(48);
        ll.append(49);
        ll.append(50);

        LinkedList.Node node = ll.removeFirst();

        assertEquals(45, node.value);
        assertEquals(50, ll.getTail().value);
        assertEquals(46, ll.getHead().value);
    }

    @Test
    void removeFirstOneElement() {
        LinkedList ll = new LinkedList(45);

        LinkedList.Node node = ll.removeFirst();

        assertEquals(45, node.value);
        assertNull(ll.getTail());
        assertNull(ll.head);
        assertEquals(0, ll.getLength());
    }

    @Test
    void removeFirstEmpty() {
        LinkedList ll = new LinkedList(45);
        ll.removeFirst();
        Exception exception = assertThrows(IllegalArgumentException.class, ll::removeFirst);
        assertEquals("List has no element to remove.", exception.getMessage());
    }

    @Test
    void prepend() {
        LinkedList ll = new LinkedList(45);
        ll.append(46);
        ll.prepend(2);
        assertEquals(3, ll.getLength());
        assertEquals(2, ll.getHead().value);
        assertEquals(46, ll.getTail().value);
    }

    @Test
    void prependOnEmptyList() {
        LinkedList ll = new LinkedList(45);
        ll.removeLast();
        assertNull(ll.getHead());
        ll.prepend(2);
        assertEquals(1, ll.getLength());
        assertEquals(2, ll.getHead().value);
        assertEquals(2, ll.getTail().value);
    }

    @Test
    void get() {
        LinkedList ll = new LinkedList(45);
        ll.append(46);
        ll.append(47);
        ll.append(48);
        ll.append(49);
        ll.append(50);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> ll.get(-1));

        assertEquals(45, ll.get(0).value);
        assertEquals(46, ll.get(1).value);
        assertEquals(47, ll.get(2).value);
        assertEquals(48, ll.get(3).value);
        assertEquals(49, ll.get(4).value);
        assertEquals(50, ll.get(5).value);
        assertNull(ll.get(6));
    }

    @Test
    void getEmptyList() {
        LinkedList ll = new LinkedList(45);
        ll.removeLast();
        assertNull(ll.get(0));
    }

    @Test
    void set() {
        LinkedList ll = new LinkedList(45);
        ll.append(46);
        ll.append(47);
        ll.append(48);
        ll.append(49);
        ll.append(50);

        assertTrue(ll.set(3, 8));

        assertEquals(8, ll.get(3).value);
    }

    @Test
    void setOutOfBonds() {
        LinkedList ll = new LinkedList(45);
        ll.append(46);
        ll.append(47);

        assertFalse(ll.set(3, 8));
    }


}