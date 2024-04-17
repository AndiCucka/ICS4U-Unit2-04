/*
* The CarStack Class.
*
* @author  Andi Cucka
* @version 1.0
* @since   2024-03-27
*/

import java.util.ArrayList;
import java.util.List;

/**
* The CarStack() class.
*/
public class CarStack {
    /**
    * Declares a private instance variable.
    */
    private List<String> strStack = new ArrayList<>();

    /**
    * Checks if stack is empty.
    *
    * @return true if the stack is empty, false otherwise
    */
    public boolean isEmpty() {
        return strStack.isEmpty();
    }

    /**
     * Returns top item of stack.
     *
     * @return the peaked string
     */
    public String peak() {
        final String peakedItem;
        if (!isEmpty()) {
            peakedItem = strStack.get(strStack.size() - 1);
        } else {
            peakedItem = null;
        }
        return peakedItem;
    }

    /**
    * Returns stack size.
    *
    * @return the size of the stack
    */
    public int size() {
        return strStack.size();
    }

    /**
    * The showStack() method.
    *
    * @return the values as a string
    */
    public String showStack() {
        String values = "";
        for (int counter = 0; counter < strStack.size(); counter++) {
            values += strStack.get(counter);
            if (counter < strStack.size() - 1) {
                values += ", ";
            }
        }
        return values;
    }

    /**
     * Clears the entire stack.
     */
    public void clear() {
        strStack.clear();
    }

    /**
    * The push() method.
    *
    * @param input from Main.java
    */
    public void push(String input) {
        strStack.add(input);
    }

    /**
    * This method pops a string from the stack.
    *
    * @return the popped string
    */
    public String popItem() {
        final String poppedItem;
        if (!strStack.isEmpty()) {
            poppedItem = strStack.remove(strStack.size() - 1);
        } else {
            poppedItem = null;
        }
        return poppedItem;
    }
}
