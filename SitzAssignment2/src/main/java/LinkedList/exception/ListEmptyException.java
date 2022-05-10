// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package LinkedList.exception;
/**
 *
 * @author brandon
 */
public class ListEmptyException extends Exception {
    public ListEmptyException()
    {
        super();
    }
    
    public ListEmptyException(String errorMsg)
    {
        super(errorMsg);
    }
}
