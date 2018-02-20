package cm.TD2.Agence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

/**
 * Ensemble
 */
public class Ensemble<T> implements Iterable<T> {
    
    private HashSet<T> elements;

    public Ensemble() {
        elements = new HashSet<T>();
    }

    public Ensemble(T singleton) {
        this();
        elements.add(singleton);
    }

    public int size() {
        return this.elements.size();
    }

    public void add_element(T element) {
        this.elements.add(element);
    }

    public void remove_element(T element) {
        this.elements.remove(element);
    }

    @Override
    public Iterator<T> iterator() {
        return this.elements.iterator();
    }

    public static <T> Ensemble<T> union(Ensemble<T> e0, Ensemble<T> e1) {
        Ensemble<T> e = new Ensemble<T>();
        e.elements.addAll(e0.elements);
        e.elements.addAll(e1.elements);
        return e;
    }

    public static <T> Ensemble<T> intersection(Ensemble<T> e0, Ensemble<T> e1) {
        Ensemble<T> e = new Ensemble<T>();
        for (T element : e0.elements) {
            if(e1.elements.contains((element)))
                e.elements.add(element);
        }
        return e;
    }

}