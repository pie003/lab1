/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem6lab1.Books;

/**
 *
 * @author User
 */
public class EngEduBookBuilder implements BookBuilder{
    
    private type type;
    private language language;
    private String name;
    private level level;
    private String university;
    private String author;

    @Override
    public BookBuilder setType(type type) {
        this.type=type;
        return this;
    }

    @Override
    public BookBuilder setLanguage(language language) {
        this.language=language;
        return this;
    }

    @Override
    public BookBuilder setName(String name) {
        this.name=name;
        return this;
    }

    @Override
    public BookBuilder setLevel(level level) {
        this.level=level;
        return this;
    }

    @Override
    public BookBuilder setUniversity(String university) {
        this.university=university;
        return this;
    }
    @Override
    public BookBuilder setAuthor(String author) {
        this.author=author;
        return this;
    }
    
    @Override
    public Books build(){
        EngEduBook book = new EngEduBook(language, name, type, level,university,author);
        return book;
    }
    
}
