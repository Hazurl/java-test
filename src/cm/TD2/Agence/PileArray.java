package cm.TD2.Agence;

import java.util.ArrayList;

/**
 * PileArray
 */
public class PileArray<T> implements Iterable<T>, IPile<T> {

    private ArrayList objects;

    Pile(int initial_capacity) {
        objects = new ArrayList<T>(initial_capacity);
    }

    @Override
    public void push(T object) {
        objects.add(object);
    }

    @Override
    public T pop() {
        return objects.remove(objects.size()-1);
    }

    @Override
    public bool empty() {
        return objects.isEmpty();
    }

    @Override
    public T top() {
        return objects.get(objects.size()-1);
    }

    @Override
    public Iterator<T> iterator() {
        return objects.iterator();
    }
}