// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package library;
import LinkedList.LinkedList;
import LinkedList.exception.InvalidMagazineException;
import LinkedList.exception.ListEmptyException;
import LinkedList.exception.ListException;
/**
 *
 * @author brandon
 */
public class Library {
   private LinkedList <Magazine> magazines = null;
   private int count;
   public Library()
   {
       magazines = new LinkedList();
   }
    
   public void addMagazine(Magazine magazine)
   {
       magazines.push_back(magazine);
       count++;
       System.out.println("Magazine added");
       System.out.println();
   }
   
   public int getCount()
   {
       return this.count;
   }
   
   public Magazine get(int i) throws ListException
   {
       try{
            return magazines.at(i);
        }
        catch(ListException ne){
            System.out.println(ne.getMessage());
        }
       // maybe
        return null;
   }
   
   public Magazine getMagazineWithHighestNumberOfPages() throws ListEmptyException, InvalidMagazineException, ListException
   {
       int i = 0;
      int magCount;
      magCount = getCount();
       if (magCount == 0)
       {
           throw new ListEmptyException("The list is empty");
       }
       try{
       Magazine magazineMax = magazines.front();
        while (i < magCount){
           if (magazines.at(i).getPages() > magazineMax.getPages())
           {
               magazineMax = magazines.at(i);
           }
           i++;
           }
        return magazineMax;
       }
       catch(ListEmptyException ne)
        {
              System.out.println(ne.getMessage());
              return null;
        }
   }
   
   public int getNumberOfMagazinesHavePagesMoreThan(int pages) throws InvalidMagazineException, ListEmptyException, ListException
   {
       int index = 0;
       int i =0;
       int magCount;
       magCount = getCount();
       if (pages == 0)
       {
           return getCount();
       }
       while(i < magCount)
       {
           if (pages < magazines.at(i).getPages())
           {
               index++;
           }
           i++;
       }
       return index;
   }
   
   public void printAllMagazines()
   {
       magazines.print();
   }
}
