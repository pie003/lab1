/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem6lab1.Books;

/**
 *
 * @author User
 */
public class EngEduBook extends Books{

    protected language language;
    protected String name;
    protected type type;
    protected level level;
    protected String university;
    protected String author;
    
    public EngEduBook (language language,String name,type type,level level,String university,String author){
        this.language=language;
        this.name=name;
        this.type=type;
        this.level=level;
        this.university=university;
        this.author=author;        
    }
    
    @Override
    public String getBookInfo() {
        return ("Язык: " + this.language + ", Название: " + this.name + ", Тип: " + this.type + ", Уровень: " + this.level + ", Университет: " + this.university + ", Автор: " + this.author);
    }
    
}
