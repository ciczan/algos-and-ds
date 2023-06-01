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
    void insertHead() {
        LinkedList ll = make10to20LinkedList();
        assertEquals(11, ll.getLength());

        assertTrue(ll.insert(0, 0));

        assertEquals(12, ll.getLength());
        assertEquals(0, ll.getHead().value);
    }

    @Test
    void insertTail() {
        LinkedList ll = make10to20LinkedList();
        assertEquals(11, ll.getLength());

        assertTrue(ll.insert(11, 50));

        assertEquals(12, ll.getLength());
        assertEquals(50, ll.getTail().value);

    }

    @Test
    void insertMiddle() {
        LinkedList ll = make10to20LinkedList();
        assertEquals(11, ll.getLength());

        assertTrue(ll.insert(5, 50));

        assertEquals(12, ll.getLength());
        assertEquals(50, ll.get(5).value);
    }

    @Test
    void removeHead() {
        LinkedList ll = make10to20LinkedList();
        assertEquals(11, ll.getLength());

        LinkedList.Node removed = ll.remove(0);
        assertEquals(10, removed.value);

        assertEquals(10, ll.getLength());
        assertEquals(11, ll.getHead().value);
    }

    @Test
    void removeMiddle() {
        LinkedList ll = make10to20LinkedList();
        assertEquals(11, ll.getLength());

        LinkedList.Node removed = ll.remove(5);
        assertEquals(15, removed.value);

        assertEquals(10, ll.getLength());
        assertEquals(16, ll.get(5).value);
    }

    @Test
    void removeTail() {
        LinkedList ll = make10to20LinkedList();
        assertEquals(11, ll.getLength());

        LinkedList.Node removed = ll.remove(ll.getLength());
        assertEquals(20, removed.value);

        assertEquals(10, ll.getLength());
        assertEquals(10, ll.getHead().value);
    }

    @Test
    void removeLast() {

        LinkedList ll = make10to20LinkedList();

        LinkedList.Node node = ll.removeLast();

        assertEquals(20, node.value);
        assertEquals(19, ll.getTail().value);
        assertEquals(10, ll.getHead().value);
    }

    private static LinkedList make10to20LinkedList() {
        LinkedList ll = new LinkedList(10);
        for (int ii = 11; ii <= 20; ii++) {
            ll.append(ii);
        }
        return ll;
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

        LinkedList ll = make10to20LinkedList();

        LinkedList.Node node = ll.removeFirst();

        assertEquals(10, node.value);
        assertEquals(20, ll.getTail().value);
        assertEquals(11, ll.getHead().value);
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
        LinkedList ll = make10to20LinkedList();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> ll.get(-1));

        //This also tests the make10to20LinkedList() method.
        assertEquals(10, ll.get(0).value);
        assertEquals(11, ll.get(1).value);
        assertEquals(12, ll.get(2).value);
        assertEquals(13, ll.get(3).value);
        assertEquals(14, ll.get(4).value);
        assertEquals(15, ll.get(5).value);
        assertEquals(16, ll.get(6).value);
        assertEquals(17, ll.get(7).value);
        assertEquals(18, ll.get(8).value);
        assertEquals(19, ll.get(9).value);
        assertEquals(20, ll.get(10).value);
        assertNull(ll.get(21));
    }

    @Test
    void getEmptyList() {
        LinkedList ll = new LinkedList(45);
        ll.removeLast();
        assertNull(ll.get(0));
    }

    @Test
    void set() {
        LinkedList ll = make10to20LinkedList();

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