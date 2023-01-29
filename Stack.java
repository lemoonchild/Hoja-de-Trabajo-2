import java.util.ArrayList;

/**
 * @author 
 * Maria José Villafuerte
 * Fabiola Contreras
 * Madeline Castro 
 * @category Ejercicio #2
 * Propósito: 
 * @date 30/01/2023
 */

public class Stack<T> implements IStack<T>{

    private ArrayList<T> ourStack;

    public Stack() {
        ourStack = new ArrayList<T>();
    }
    
    /**
     * 
     * @return
     */
    @Override
    public int count() {
        return ourStack.size();
    }

    /**
     * 
     * @return
     */
    @Override
    public boolean isEmpty() {
        return ourStack.isEmpty();
    }

    /**
     * 
     * 
     */
    @Override
    public void push(T value) {
        ourStack.add(0, value); 
    }

    /**
     * 
     * @return
     */
    @Override
    public T pull() {
        return ourStack.remove(0);
    }

    /**
     * 
     * @return 
     */
    @Override
    public T peek() {
        return ourStack.get(0);
    }
    
}
