/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem6lab1.Books;
import com.mycompany.sem6lab1.ReadFromXlsx;
import static java.lang.Math.max;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class BookGenerateAll {
    
    public ArrayList<Books> generateEngEduBooks(ReadFromXlsx reader, Director bookDirector, BookBuilder builder){
        ArrayList<Object> names = reader.readFromFile(7).get(0);
        ArrayList<Object> universities = reader.readFromFile(8).get(0);
        ArrayList<Object> authors = reader.readFromFile(9).get(0);
        ArrayList<Books> engEduBooks =new ArrayList();
        int min1 = Math.min(names.size(), universities.size());
        int minValue=Math.min(min1, authors.size());
        Random random = new Random();
        for (int i=0; i<minValue;i++){
            int l=random.nextInt(2)+1;
            level Level;
            if (l==1){
                Level=level.Bachelor;
            } else {
                Level=level.Master;
            }
            EngEduBook book =(EngEduBook) bookDirector.createEngEduBook(builder, names.get(i).toString(), Level, universities.get(i).toString(), authors.get(i).toString());
            engEduBooks.add(book);
        }
        return engEduBooks;    
    }
    
    public ArrayList<Books> generateRusEduBooks(ReadFromXlsx reader, Director bookDirector, BookBuilder builder){
        ArrayList<Object> names = reader.readFromFile(5).get(0);
        ArrayList<Object> types = reader.readFromFile(6).get(0);
        int maxValue = max(names.size(),types.size());
        ArrayList<Books> rusEduBooks =new ArrayList();
        ArrayList<Integer> usedNames = new ArrayList(); 
        Random random = new Random();
        for (int i=0; i<maxValue;i++){
            int n=random.nextInt(names.size());
            while(usedNames.contains(n)){
                n=random.nextInt(names.size());
            }
            usedNames.add(n);
            int t=random.nextInt(types.size());
            rusEduBooks.add(bookDirector.createRusEduBook(builder, types.get(t).toString()+' '+ names.get(n).toString()));
        }
        return rusEduBooks;    
    }
    
    public ArrayList<Books> generateEngFicBooks(ReadFromXlsx reader, Director bookDirector, BookBuilder builder){
        ArrayList<Object> names = reader.readFromFile(12).get(0);
        ArrayList<Object> authors = reader.readFromFile(13).get(0);
        ArrayList<Books> engFicBooks =new ArrayList();
        int minValue=Math.min(names.size(),authors.size());
        for (int i=0; i<minValue;i++){
            engFicBooks.add(bookDirector.createEngFicBook(builder, names.get(i).toString(), authors.get(i).toString()));
        }
        return engFicBooks;    
    }
    
    public ArrayList<Books> generateRusFicBooks(ReadFromXlsx reader, Director bookDirector, BookBuilder builder){
        ArrayList<Object> names = reader.readFromFile(10).get(0);
        ArrayList<Object> authors = reader.readFromFile(11).get(0);
        ArrayList<Books> rusFicBooks =new ArrayList();
        int minValue=Math.min(names.size(),authors.size());
        for (int i=0; i<minValue;i++){
            rusFicBooks.add(bookDirector.createRusFicBook(builder, names.get(i).toString(), authors.get(i).toString()));
        }
        return rusFicBooks;    
    }
}
