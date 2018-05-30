import java.util.*;
import java.util.List;

/**
 * Beschreiben Sie hier die Klasse Datenstruktur.
 * 
 * @author Roland Daidone
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Datenstruktur <T> 
{

    List<Object> listAnything = new LinkedList<>();

    //Initialisierung der Main-Methode
    public static void main(String[] args) {
        new Datenstruktur().start();
    }

    //Aufgabe 1a
    private class DoppelteListe implements List {

        @Override
        public int size() {
            return 0;
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
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
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
            return false;
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
            return 0;
        }

        @Override
        public ListIterator listIterator() {
            return null;
        }

        @Override
        public ListIterator listIterator(int index) {
            return null;
        }

        @Override
        public List subList(int fromIndex, int toIndex) {
            return null;
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }
    }

    // Wert des Knotens
    private int value;

    // Vorheriger Knoten
    private Datenstruktur prev;

    // Nächster Knoten
    private Datenstruktur next;

    // Kopf der Liste
    private Datenstruktur head;

    // Schwanz der Liste
    private Datenstruktur tail;

    public void setValue(int v) {
        value = v;
    }

    public void setPrev(Datenstruktur p) {
        prev = p;
    }

    public void setNext(Datenstruktur n) {
        next = n;
    }

    public int getValue() {
        return value;
    }

    public Datenstruktur getPrev() {
        return prev;
    }

    public Datenstruktur getNext() {
        return next;
    }

    /**
     * Main-Methode mit verschiedenen Test-Szenarien je nach Aufgabenstellung
     */
    public void start() {

        LinkedList<Object> listAnything = new LinkedList<>();
        listAnything.addFirst(new Object());
        listAnything.add(new Object());
        listAnything.add(new Object());
        listAnything.add(new Object());
        listAnything.addLast(new Object());
    }
}
