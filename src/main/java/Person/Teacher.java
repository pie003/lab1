/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author User
 */
public class Teacher extends Person {
    protected String name;
    protected String surname;
    protected String patronymic;
    protected boolean gender;
    
    public Teacher (String name, String surname, String patronymic){
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
    }
    @Override
    public String getPersonInfo() {
        return (this.name+' '+this.patronymic+' '+this.surname);
    }
}
