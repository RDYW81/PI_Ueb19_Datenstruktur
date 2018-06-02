import java.util.*;
import java.util.List;

/**
 * Beschreiben Sie hier die Klasse Datenstruktur.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 1.0
 */

public class Datenstruktur <T> implements List
{

    // Fehlermeldung
    private static final String MSG_NICHT_UNTERSTUEZT =
        "Methode wird nicht unterstützt";

    // Wert des Knotens
    private T value;

    // Vorheriger Knoten
    private Datenstruktur<T> prev;

    // Nächster Knoten
    private Datenstruktur<T> next;

    // Kopf der Liste
    private Datenstruktur<T> head;

    // Schwanz der Liste
    private Datenstruktur<T> tail;

    public void setValue(T v) {
        value = v;
    }

    public void setPrev(Datenstruktur<T> p) {
        prev = p;
    }

    public void setNext(Datenstruktur<T> n) {
        next = n;
    }

    public Object getValue() {
        return value;
    }

    public Datenstruktur getPrev() {
        return prev;
    }

    public Datenstruktur getNext() {
        return next;
    }

    // /**
    // * Fügt ein Objekt T am Anfang der Liste ein.
    // *
    // * @param T Einzufügender Wert
    // */
    // public void insertFirst(Object T) {
    // // Neuen Knoten anlegen
    // Datenstruktur node = new Datenstruktur();
    // node.setValue(T);
    // // Ist die Liste noch leer?
    // if (head == null) {
    // head = node;
    // tail = node;
    // } else {
    // node.setNext(head);
    // head.setPrev(node);
    // head = node;
    // }
    // }

    // /**
    // * Fügt ein Objekt T am Ende der Liste ein.
    // *
    // * @param T Einzufügender Wert
    // */
    // public void insertLast(Object T) {
    // // Neuen Knoten anlegen
    // Datenstruktur node = new Datenstruktur();
    // node.setValue(T);
    // // Ist die Liste noch leer?
    // if (head == null) {
    // head = node;
    // tail = node;
    // } else {
    // node.setPrev(tail);
    // tail.setNext(node);
    // tail = node;
    // }
    // }

    // /**
    // * Fügt ein Objekt T in die Liste ein.
    // *
    // * @param T Einzufügender Wert
    // */
    // public void insert(Object T) {
    // insertFirst(T);
    // }

    // /**
    // * Löscht das erste Objekt in der Liste.
    // *
    // * @return Gelöschtes Objekt
    // */
    // public Object deleteFirst() {
    // Object T = 0;
    // if (head != null) {
    // T = head.getValue();
    // // Besteht die Liste nur aus einem Wert?
    // if (head == tail) {
    // head = null;
    // tail = null;
    // } else {
    // Datenstruktur newHead = head.getNext();
    // head.setNext(null);
    // newHead.setPrev(null);
    // head = newHead;
    // }
    // }
    // return T;
    // }

    // /**
    // * Löscht das letzte Object in der Liste.
    // *
    // * @return Gelöschtes Objekt
    // */
    // public Object deleteLast() {
    // Object T = 0;
    // if (tail != null) {
    // T = tail.getValue();
    // // Besteht die Liste nur aus einem Wert?
    // if (head == tail) {
    // head = null;
    // tail = null;
    // } else {
    // Datenstruktur newTail = tail.getPrev();
    // tail.setPrev(null);
    // newTail.setNext(null);
    // tail = newTail;
    // }
    // }
    // return T;
    // }

    // /**
    // * Löscht ein Vorkommen eines Objekt T in der Liste.
    // *
    // * @param T Zu löschendes Objekt
    // * @return ob ein Objekt gelöscht wurde
    // */
    // public boolean delete(Object T) {
    // boolean found = false;
    // if (head != null) {
    // Datenstruktur cur = head;
    // while (cur != null && cur.getValue() != T) {
    // cur = cur.getNext();
    // }
    // if (cur != null) {
    // found = true;
    // Datenstruktur prev = cur.getPrev();
    // Datenstruktur next = cur.getNext();
    // if (prev != null) {
    // prev.setNext(next);
    // } else {
    // head = next;
    // }
    // if (next != null) {
    // next.setPrev(prev);
    // } else {
    // tail = prev;
    // }
    // cur.setPrev(null);
    // cur.setNext(null);
    // }
    // }
    // return found;
    // }

    // /**
    // * Sucht in einfach verketter Liste.
    // *
    // * @param T Zu suchendes Objekt
    // * @return Ist das Objekt in der Liste enthalten?
    // */
    // public boolean search(Object T) {
    // boolean found = false;
    // if (head != null) {
    // Datenstruktur cur = head;
    // while (cur != null && cur.getValue() != T) {
    // cur = cur.getNext();
    // }
    // if (cur != null) {
    // found = true;
    // }
    // }
    // return found;
    // }

    // /**
    // * Stellt fest, ob die Liste leer ist.
    // *
    // * @return Ist die Liste leer?
    // */
    // public boolean isEmpty() {
    // return head == null;
    // }
    // * Wiedergabe der Liste als Zeichenkette.
    // *
    // * @return Liste als Zeichenkette
    // */
    // public String toString() {
    // StringBuilder sb = new StringBuilder();
    // sb.append("(");
    // Datenstruktur cur = head;
    // while (cur != null) {
    // sb.append(cur.getValue());
    // if (cur.getNext() != null) {
    // sb.append(" <-> ");
    // }
    // cur = cur.getNext();
    // }
    // sb.append(")");
    // return sb.toString();
    // }

    
    //Aufgabe 1a
    /**
     * Bestimme Anzahl der in der Liste enthaltenen Objekte.
     *
     * @return Größe der Liste
     */   
    @Override
    public int size() {
        int size = 0;
        Datenstruktur cur = head;
        while (cur != null) {
            size++;
            cur = cur.getNext();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public Object[] toArray() {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public ListIterator listIterator() {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    public static void main(String[] args) {
        List<Object> node = new LinkedList<>();
        node.add(1);
        node.add(1.25);
        node.add('A');
        node.add("Item");
        node.size();
        System.out.println("Inhalt: " +node);
        System.out.println("Größe: " +node.size());
    }
}
