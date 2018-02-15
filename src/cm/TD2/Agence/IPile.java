package cm.TD2.Agence;

/**
 * IPile
 */
public interface IPile<T> {
    
    void push(T object);
    T pop();
    bool empty();
    T top();
    
}