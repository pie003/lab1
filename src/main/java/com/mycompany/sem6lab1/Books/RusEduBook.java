/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem6lab1.Books;

/**
 *
 * @author User
 */
public class RusEduBook extends Books{
    protected language language;
    protected String name;
    protected type type;
    
    public RusEduBook (language language,String name,type type){
        this.language=language;
        this.name=name;
        this.type=type;        
    }
    @Override
    public String getBookInfo() {
        return ("Язык: " + this.language + ", Название: " + this.name + ", Тип: " + this.type);
    }
    
}
