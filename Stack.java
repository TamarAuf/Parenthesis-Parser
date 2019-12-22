
package parenthesisparser;



import java.util.*;

/**
 * our own generic stack implementation
 * stack is hidden in a private ArrayList stack
 * @author Katz9
 * @param <T>
 */
public class Stack<T>
{

    private final ArrayList<T> stack;

    /**
     * constructor
     */
    public Stack()
    {
        stack = new ArrayList<>();
    }

    /**
     * push an item on the stack
     * @param item : T - item to push
     */
    public void push(T item)
    {
        stack.add(item);
    }

    /**
     * pop:  remove and return the top item from the stack
     * @return T : item on the top of the stack.  null - if the stack is empty
     */
    public T pop()
    {
        T item = null;
        int size = stack.size();
        if (size > 0)
        {
            item = stack.remove(size - 1);
        }
        return item;
    }

    /**
     * top (peek)
     * @return T : top item currently on the stack.  null - if the stack is empty
     */
    public T top()
    {
        T item = null;
        int size = stack.size();
        if (size > 0)
        {
            item = stack.get(size -1);
        }
        return item;
    }
    
    public boolean isEmpty()
    {
        boolean item = true;
        int size = stack.size();
        if (size > 0)
        {
            item = false;
        }
        return item; 
    }

    /**
     * toString()
     * @return : String - elements of the stack one per line.
     */
    @Override
    public String toString()
    {
        String view = "";
        int ix = stack.size() - 1;
        while (ix >= 0)
        {
            view += (stack.get(ix--).toString() + "\n");
        }
        return view;
    }
    
      
}

