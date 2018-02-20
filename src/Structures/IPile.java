package Structures;

/**
 * IPile
 */
public interface IPile<T> {
    
    void push(T object);
    T pop();
    boolean empty();
    T top();
    
}