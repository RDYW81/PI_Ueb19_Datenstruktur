import java.util.*;
import java.util.List;

/**
 * Beschreiben Sie hier die Klasse Datenstruktur.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 1.0
 */

public class Datenstruktur <T> implements java.util.List<T>
{

    //Attribut
    private int size;

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

    /**
     * Prüfung, ob die Liste leer ist
     * 
     * @return True bei leerer Liste
     * @return False bei gefüllter Liste
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Sucht in einfach verketter Liste.
     *
     * @param T Zu suchendes Objekt
     * @return Ist das Objekt in der Liste enthalten?
     */
    @Override
    public boolean contains(Object T) {
        boolean found = false;
        if (head != null) {
            Datenstruktur cur = head;
            while (cur != null && cur.getValue() != T) {
                cur = cur.getNext();
            }
            if (cur != null) {
                found = true;
            }
        }
        return found;
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
    public Object[] toArray(Object[] T) {
        return null;
    }

    /**
     * Fügt ein Objekt T in die Liste ein und gibt true als Bestätigung zurück.
     *
     * @param T Einzufügendes Objekt
     * @return true Objekt eingefügt
     */
    @Override
    public boolean add(Object T) {
        Datenstruktur node = new Datenstruktur();
        node.setValue(T);
        // Ist die Liste noch leer?
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        return true;
    }

    /**
     * Entfernt ein Objekt T aus der Liste und gibt true als Bestätigung zurück.
     *
     * @param T Entferndendes Objekt
     * 
     * @return true Objekt gefunden und entfernt
     * @return false Objekt nicht gefunden
     */
    @Override
    public boolean remove(Object T) {
        boolean found = false;
        if (head != null) {
            Datenstruktur cur = head;
            while (cur != null && cur.getValue() != T) {
                cur = cur.getNext();
            }
            if (cur != null) {
                found = true;
                Datenstruktur prev = cur.getPrev();
                Datenstruktur next = cur.getNext();
                if (prev != null) {
                    prev.setNext(next);
                } else {
                    head = next;
                }
                if (next != null) {
                    next.setPrev(prev);
                } else {
                    tail = prev;
                }
                cur.setPrev(null);
                cur.setNext(null);
            }
        }
        return found;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new java.lang.UnsupportedOperationException(MSG_NICHT_UNTERSTUEZT);
    }

    /**
     * Entfernt alle Objekte aus der Liste.
     */
    @Override
    public void clear() {
        Datenstruktur list = new Datenstruktur();
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        return null;   
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object T) {
        Datenstruktur node = new Datenstruktur();
        node.setValue(T);
        // Ist die Liste noch leer?
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object T) {
        int index = 0;
        Datenstruktur cur = head;

        while (cur!= null) {
            if (cur.getValue().equals(T)) {
                // if (cur.equals(T)) {
                return index;
            }
            index++;
            cur = cur.next;
        }

        return -1;
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
    public ListIterator<T> listIterator(int index) {
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

    /** 
     * Wiedergabe der Liste als Zeichenkette.
     *
     * @return Liste als Zeichenkette
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Datenstruktur cur = head;
        while (cur != null) {
            sb.append(cur.getValue());
            if (cur.getNext() != null) {
                sb.append(" <-> ");
            }
            cur = cur.getNext();
        }
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Object> node = new LinkedList<>();
        node.add(100);
        node.add(1.25);
        node.add('A');
        node.add("Item");
        node.size();
        node.isEmpty();
        System.out.println("Inhalt:              " +node);
        System.out.println("Größe:               " +node.size());
        System.out.println("Leer? false/true:    " +node.isEmpty());
        node.remove(0);
        System.out.println("Anwendung von Remove an Index 0:");
        System.out.println("Inhalt:              " +node);
        System.out.println("Größe:               " +node.size());
        System.out.println("Clear auf alle Inhalte:");
        node.clear();   // Funktioniert hier, jedoch nicht im JUnit. Warum?
        System.out.println("Inhalt:              " +node); 
    }
}
