/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import com.mycompany.sem6lab1.ReadFromXlsx;
import java.util.ArrayList;
import java.util.Random;
import static java.lang.Math.max;

/**
 *
 * @author User
 */
public class PersonGenerateAll {
    
    public ArrayList<Person> generateStudents (ReadFromXlsx reader, PersonFactory factory){
        ArrayList<Object> namesValue = reader.readFromFile(0).get(0);
        ArrayList<Object> namesGender = reader.readFromFile(0).get(1);
        ArrayList<Object> surnamesValue = reader.readFromFile(1).get(0);
        ArrayList<Object> surnamesGender = reader.readFromFile(1).get(1);
        Random random = new Random();
        ArrayList<Person> students =new ArrayList();
        int max1=max(namesValue.size(),namesGender.size());
        int max2=max(surnamesValue.size(),surnamesGender.size());
        int maxValue=max(max1, max2);
        
        for (int i=0; i<maxValue; i++){
            int n=random.nextInt(namesValue.size());
            int s=random.nextInt(surnamesValue.size());
            while (!namesGender.get(n).equals(surnamesGender.get(s))){
                s=random.nextInt(surnamesValue.size());
            }
            if (!students.contains(factory.createPerson(personType.student, namesValue.get(n).toString(), surnamesValue.get(s).toString(), null))){
               students.add(factory.createPerson(personType.student, namesValue.get(n).toString(), surnamesValue.get(s).toString(), null));
            } 
        }
        return students;
    }
    
    public ArrayList<Person> generateTeacher (ReadFromXlsx reader, PersonFactory factory){
        ArrayList<Object> namesValue = reader.readFromFile(2).get(0);
        ArrayList<Object> namesGender = reader.readFromFile(2).get(1);
        ArrayList<Object> surnamesValue = reader.readFromFile(3).get(0);
        ArrayList<Object> surnamesGender = reader.readFromFile(3).get(1);
        ArrayList<Object> patronymicsValue = reader.readFromFile(4).get(0);
        ArrayList<Object> patronymicsGender = reader.readFromFile(4).get(1);
        Random random = new Random();
        ArrayList<Person> teachers =new ArrayList();
        int max1=max(namesValue.size(),namesGender.size());
        int max2=max(surnamesValue.size(),surnamesGender.size());
        int max3=max(patronymicsValue.size(),patronymicsGender.size());
        int max4=max(max1,max2);
        int maxValue=max(max3,max4);
        for (int i=0; i<maxValue; i++){
            int n=random.nextInt(namesValue.size());
            int s=random.nextInt(surnamesValue.size());
            int p=random.nextInt(patronymicsValue.size());
            while (!(namesGender.get(n).equals(surnamesGender.get(s))&&(namesGender.get(n).equals(patronymicsGender.get(p))))){
                s=random.nextInt(surnamesValue.size());
                p=random.nextInt(patronymicsValue.size());
            }
            Teacher teacher = (Teacher) factory.createPerson(personType.teacher, namesValue.get(n).toString(), surnamesValue.get(s).toString(), patronymicsValue.get(p).toString());
            if (!teachers.contains(teacher)){
               teachers.add(teacher);
            } 
        }
        return teachers;
    }
    
}
