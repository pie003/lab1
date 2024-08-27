/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sem6lab1.Books;

/**
 *
 * @author User
 */
public interface BookBuilder {
   BookBuilder setType (type type);
   BookBuilder setLanguage (language language);
   BookBuilder setName (String name);
   BookBuilder setLevel (level level);
   BookBuilder setUniversity (String university);
   BookBuilder setAuthor (String author);
   Books build();
}
