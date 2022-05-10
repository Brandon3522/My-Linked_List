// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package LinkedList.exception;
/**
 *
 * @author brandon
 */
public class InvalidMagazineException extends Exception {
    
    public InvalidMagazineException()
    {
        super();
    }
    
    public InvalidMagazineException(String errorMsg)
    {
        super(errorMsg);
    }
}
