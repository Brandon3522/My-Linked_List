// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package library;
import LinkedList.exception.InvalidMagazineException;
/**
 *
 * @author brandon
 */
public class Magazine {
    private String mName;
    private int mEdition;
    private int mPublishYear;
    private int mPages;
    
    // Constructor needs to throw InvalidMagazineException for error validation
    public Magazine(String name, int edition, int publishYear, int pages) throws InvalidMagazineException
    {
        if (name == null)
        {
            throw new InvalidMagazineException("Name required");
        }
        this.mName = name;
        if (edition < 1)
        {
            throw new InvalidMagazineException("Edition must be greater than 1");
        }
        this.mEdition = edition;
        if (publishYear <= 2000)
        {
            throw new InvalidMagazineException("Publish year is less than or equal to 2000");
        }
        this.mPublishYear = publishYear;
        if (pages < 0)
        {
             throw new InvalidMagazineException("Pages must be greater than 0");
        }
        this.mPages = pages;        
    }
   
    // return name of magazine
   public String getName()
    {
      return this.mName;        
    }
    
   // return edition of magazine
   public int getEdition()
    {
        return this.mEdition;        
    }
    
   // return publish year
   public int getPublishYear()
   {
       return this.mPublishYear;      
   }
    
   // return pages
    public int getPages()
    {
        return this.mPages;       
    }
    
    @Override
    public String toString(){
        return "Name: " + this.mName + " Edition: " + this.mEdition + " Publish Year: "+ this.mPublishYear +
                " Pages: " + this.mPages;
    }
}
