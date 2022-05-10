// Brandon Sitz
// Programming Assignment 2
// CSCI 3250
package library;
import LinkedList.exception.InvalidMagazineException;
import LinkedList.exception.ListEmptyException;
import LinkedList.exception.ListException;
import java.util.Scanner;
/**
 *
 * @author brandon
 */
public class LibraryManagement {
    
    public static void main(String[] args) throws ListEmptyException, ListException, InvalidMagazineException
    {       
        Library library = new Library();
        int choice;
        System.out.println("Welcome to my library management system");
        Scanner key = new Scanner(System.in);
        do
        {
            System.out.println("Please choose an option between 1 to 6");
            System.out.println("1. Add Magazine");
            System.out.println("2. Get Magazine count");
            System.out.println("3. Get the Magazine with the highest number of pages");
            System.out.println("4. Get number of Magazines that have more pages than ?");
            System.out.println("5. Print all Magazines");
            System.out.println("6. Quit the program");
            choice = key.nextInt();
            switch(choice){
                case 1:
                    // try catch for add magazine
                    System.out.println("Enter magazine's name: ");
                    key.nextLine();
                    String name = key.nextLine();
                    System.out.println("Enter magazine's edition: ");
                    int edition = key.nextInt();
                    System.out.println("Enter magazine's publish year: ");
                    int publishYear = key.nextInt();
                    System.out.println("Enter magazine's pages: ");
                    int pages = key.nextInt();
                    try{
                    Magazine magazine = new Magazine(name, edition, publishYear, pages);
                    library.addMagazine(magazine);
                    
                    }catch(InvalidMagazineException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Number of Magazines: " + library.getCount());
                    System.out.println();
                    break;
                case 3:
                    System.out.println(library.getMagazineWithHighestNumberOfPages());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the number of pages");
                    int page = key.nextInt();
                    System.out.println("There are " + library.getNumberOfMagazinesHavePagesMoreThan(page) + 
                            " magazine(s) that have more pages than " + page + " page(s)");
                    System.out.println();
                    break;
                case 5:
                    library.printAllMagazines();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Exiting program");
                    System.out.println();
                    break;
                default: System.out.println("Invalid choice!");
                    break;                 
            } 
        }while(choice >= 1 && choice <=5);
    }
}

