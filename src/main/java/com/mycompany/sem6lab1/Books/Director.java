/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem6lab1.Books;

/**
 *
 * @author User
 */
public class Director {
    
   public Books createEngEduBook (BookBuilder builder,String name, level level, String university,String author){
       return builder.setLanguage(language.english).setName(name).setType(type.edu).setLevel(level).setUniversity(university).setAuthor(author).build();
   } 
   
    public Books createRusEduBook (BookBuilder builder,String name){
       return builder.setLanguage(language.russian).setName(name).setType(type.edu).build();
   }
    
   public Books createEngFicBook (BookBuilder builder,String name, String author){
       return builder.setLanguage(language.english).setName(name).setType(type.fiction).setAuthor(author).build();
   }
   
    public Books createRusFicBook (BookBuilder builder,String name, String author){
       return builder.setLanguage(language.russian).setName(name).setType(type.fiction).setAuthor(author).build();
   } 
}
