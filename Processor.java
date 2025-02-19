/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbaitap;
       import java.util.Date;

/**
 *
 * @author ThinkPad
 */
public class Processor {
       public static void main(String[] args) {
        PersonList personList = new PersonList();

        personList.addPerson(new Student("S001", "City A", new Date(), "Computer Science"));
        personList.addPerson(new Teacher("T001", "City B", new Date(), "Mathematics"));

        personList.displayAll();
    }
}
