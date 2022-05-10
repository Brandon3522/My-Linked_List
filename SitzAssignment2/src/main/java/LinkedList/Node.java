// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package LinkedList;
/**
 *
 * @author brandon
 * @param <T>
 */
public class Node<T> {
    // data to hold in the node
    private T data;
    // next node
    private Node<T> next;
    // previous node
    private Node<T> prev;
    
    public Node(T value)
    {
       this.data = value;
       this.next = null;
    }
    
    public Node(T value, Node<T> nextNode)
    {
        this.data = value;
        this.next = nextNode;    
    }
    
    public Node(T value, Node<T> nextNode, Node <T> prevNode)
    {
        this.data = value;
        this.next = nextNode;
        this.prev = prevNode;    
    }
    
    public T getData()
    {
        return this.data;
    }
    
    public Node<T> getNext()
    {
        return this.next;   
    }
    
    public Node<T> getPrev()
    {
        return this.prev;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    public void setNext(Node <T> next)
    {
        this.next = next;
    }
    
    public void setPrev(Node <T> prev)
    {
        this.prev = prev;
    }  
}
