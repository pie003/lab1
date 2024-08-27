/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author User
 */
public class Student extends Person{
    protected String name;
    protected String surname;
    protected boolean gender;
    
    public Student (String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    @Override
    public String getPersonInfo() {
       return (this.name+' '+this.surname);
    }   
}
