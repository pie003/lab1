/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author User
 */
public class PersonFactory {
    public Person createPerson (personType type,String name, String surname, String patronymic){
        if (personType.student == type){
            return new Student(name, surname);
        }
        return new Teacher(name, surname,patronymic);
    } 
}
