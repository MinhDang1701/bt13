/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbaitap;
import java.util.ArrayList;
/**
 *
 * @author ThinkPad
 */
public class PersonList {

    ArrayList<Person> people= new ArrayList<>();
public void addPerson(Person person){
    people.add(person);
}
public boolean deletePersonById(String id){
    return people.removeIf(person -> person.id.equals(id));
       
}
public void editPersonById(String id){
    for(Person person:people){
        if(person.id.equals(id)){
            
        }
    }
}
public void displayAll() {
        for (Person person : people) {
            person.displayInfo();
        }
    }

}
