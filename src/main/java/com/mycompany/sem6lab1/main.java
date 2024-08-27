/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sem6lab1;

import Person.*;
import com.mycompany.sem6lab1.Books.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {
        ReadFromXlsx reader=new ReadFromXlsx();
        PersonFactory factory=new PersonFactory();
        PersonGenerateAll personGenerator=new PersonGenerateAll();
        ArrayList<Person> students = personGenerator.generateStudents(reader, factory);
        ArrayList<Person> teachers = personGenerator.generateTeacher(reader, factory);
        Librarian librarian= new Librarian();
        Director bookDirector = new Director();
        EngEduBookBuilder engEduBookBuilder= new EngEduBookBuilder();
        RusEduBookBuilder rusEduBookBuilder= new RusEduBookBuilder();
        EngFicBookBuilder engFicBookBuilder= new EngFicBookBuilder();
        RusFicBookBuilder rusFicBookBuilder= new RusFicBookBuilder();
        BookGenerateAll bookGenerator = new BookGenerateAll();
        ArrayList<Books> engEduBook = bookGenerator.generateEngEduBooks(reader, bookDirector, engEduBookBuilder);
        ArrayList<Books> rusEduBook = bookGenerator.generateRusEduBooks(reader, bookDirector, rusEduBookBuilder);
        ArrayList<Books> engFicBook = bookGenerator.generateEngFicBooks(reader, bookDirector, engFicBookBuilder);
        ArrayList<Books> rusFicBook = bookGenerator.generateRusFicBooks(reader, bookDirector, rusFicBookBuilder);
        Gui gui = new Gui(librarian, engEduBook, rusEduBook, engFicBook,rusFicBook,teachers,students);
        gui.setVisible(true);
    }
}
