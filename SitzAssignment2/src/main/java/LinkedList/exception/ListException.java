// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package LinkedList.exception;
/**
 *
 * @author brandon
 */
public class ListException extends Exception {
    public ListException(){
        super();
    }
    
    public ListException(String errorMsg){
        super(errorMsg);
    }
}
