// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package LinkedList;
import LinkedList.exception.ListEmptyException;
import LinkedList.exception.ListException;
/**
 *
 * @author brandon
 * @param <T>
 */
public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;    
    }
    
    // returns size of linked list
    public int size()
    {
        return this.size;
    }
    
    public void push_back(T value)
    {
        if (size() == 0)
        {
            head = tail = new Node(value);
        }
        else
        {
            tail.setNext(new Node(value, null, tail));
            tail = tail.getNext();
        }
        size++;
    }
    
    public void push_front(T value)
    {
        if (size() == 0)
        {
            head = tail = new Node(value);
        }
        else
        {
            head.setPrev(new Node(value, head, null));
            head = head.getPrev();
        }
        size++;
    }
    
    public void print()
    {
        Node <T> curr = head;
        while(curr != null)
        {
            System.out.println(curr.getData());
            curr = curr.getNext();                    
        }
    }
    
    public T pop_back() throws ListEmptyException
    {
         if (size() == 0)
        {
            throw new ListEmptyException("The list is empty");
        }
       T value = tail.getData();       
        if (size() == 1)
        {
            head = tail = null;
        }
        else
        {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        size--;
        return value;
    }
    
    public T pop_front() throws ListEmptyException
    {
         if (size() == 0)
        {
            throw new ListEmptyException("The list is empty");
        }
        T value = head.getData();
        if (size() == 1)
        {
            head = tail = null;
        }
        else
        {
            head = head.getNext();
            head.setPrev(null);
        }
        size--;
        return value;       
    }
    
    public T at(int index) throws ListException
    {
        if (index < 0 || index >= size())
        {
            throw new ListException("Index out of bounds!!");
        }
        if (index == 0)
        {
            return this.head.getData();
        }
        if (index == size() - 1)
        {
        return this.tail.getData();
        }
        Node <T> curr = head;
        int i = 0;
        while(curr.getNext() != null)
        {
            if (i == index - 1)
            {
                curr = curr.getNext();
            }
            i++;
        }
         return curr.getData();
    }
    
   public T front() throws ListEmptyException
    {
         if (size() == 0)
        {
            throw new ListEmptyException("The list is empty");
        }
        T value = head.getData();
        return value;        
    }
    
    public T back() throws ListEmptyException
    {
        if (size() == 0)
        {
            throw new ListEmptyException("The list is empty");
        }
        T value = tail.getData();
        return value;
    }  
}
