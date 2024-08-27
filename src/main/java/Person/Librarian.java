/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import com.mycompany.sem6lab1.Books.Books;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author User
 */
public class Librarian {
    
    public ArrayList<Books> organizedTheBooks (ArrayList<Books> engEduBooks, ArrayList<Books> rusEduBooks,ArrayList<Books> engFicBooks, ArrayList<Books> rusFicBooks){
        ArrayList<Books> libraryCollection = new ArrayList();
        libraryCollection.addAll(engEduBooks);
        libraryCollection.addAll(rusEduBooks);
        libraryCollection.addAll(engFicBooks);
        libraryCollection.addAll(rusFicBooks);
        return libraryCollection;
    }
    
    public ArrayList<Person> formAQueue (ArrayList<Person> teachers, ArrayList<Person> students){
        ArrayList<Person> queue = new ArrayList();
        queue.addAll(teachers);
        queue.addAll(students);
        return queue;
    }
    
    public HashMap<Person,ArrayList<Books>> giveBooksToPersons(ArrayList<Person> persons,ArrayList<Books> books){
        Random random = new Random();
        HashMap<Person,ArrayList<Books>> personBookCards = new HashMap<>();
        
        for (Person person:persons){
            int bookValue=random.nextInt(8)+3;
            ArrayList<Books> bookList = new ArrayList();
            for (int i=1;i<=bookValue;i++){
                int bookIndex=random.nextInt(books.size());
                while (bookList.contains(books.get(bookIndex))){
                    bookIndex=random.nextInt(books.size());
                }
                bookList.add(books.get(bookIndex));
            }
            personBookCards.put(person, bookList);
        }
        return personBookCards;
    }
}
