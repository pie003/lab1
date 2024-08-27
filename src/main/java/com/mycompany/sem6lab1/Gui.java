/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem6lab1;

import Person.Librarian;
import Person.Person;
import com.mycompany.sem6lab1.Books.Books;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author User
 */
public class Gui extends JFrame {
    private JTree jtree;
    private final DefaultMutableTreeNode rootTree;
    private final DefaultMutableTreeNode students;
    private final DefaultMutableTreeNode teachers;
    private final JScrollPane scrollpane;
    
    public Gui (Librarian librarian, ArrayList<Books> engEduBooks, ArrayList<Books> rusEduBooks,ArrayList<Books> engFicBooks, ArrayList<Books> rusFicBooks, ArrayList<Person> teachers, ArrayList<Person> students){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(700, 500); 
        this.setLayout(new BorderLayout());
        this.rootTree = new DefaultMutableTreeNode("Читатели");
        this.jtree = new JTree(this.rootTree);      
        this.students = new DefaultMutableTreeNode("Студенты");
        this.teachers = new DefaultMutableTreeNode("Преподаватели");
        this.rootTree.add(this.teachers);
        this.rootTree.add(this.students);
        this.scrollpane = new JScrollPane(this.jtree);
        this.add(this.scrollpane);
        
        ArrayList<Books> allBooks=librarian.organizedTheBooks(engEduBooks, rusEduBooks, engFicBooks, rusFicBooks);
        ArrayList<Person> allPersons=librarian.formAQueue(teachers, students);
        HashMap<Person,ArrayList<Books>> booksToPersons=librarian.giveBooksToPersons(allPersons, allBooks);
        for (Person person: allPersons){
            DefaultMutableTreeNode personNode=new DefaultMutableTreeNode(person.getPersonInfo());
            if (teachers.contains(person)){
                this.teachers.add(personNode);
            } else {
                this.students.add(personNode);
            }
            for (int i=0; i< booksToPersons.get(person).size();i++){
               DefaultMutableTreeNode bookNode=new DefaultMutableTreeNode(booksToPersons.get(person).get(i).getBookInfo()); 
               personNode.add(bookNode);
            }
        }
    }
}
