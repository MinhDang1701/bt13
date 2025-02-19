/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbaitap;

import java.util.Date;

/**
 *
 * @author ThinkPad
 */
public class Person {

    String id;
    String homeTown;
    Date dateofBirth;

    public Person(String id, String homeTown, Date dateofBirth) {
        this.id = id;
        this.dateofBirth = dateofBirth;
        this.homeTown = homeTown;
    }

    public void displayInfo() {
        System.out.println("id" + id + "| homeTown" + homeTown + "| dateofbirth" + dateofBirth);

    }

    class Student extends Person {

        String major;

        public Student(String major, String id, String homeTown, Date dateofBirth) {
            super(id, homeTown, dateofBirth);
            this.major = major;
        }

        public void displayInfo() {
            super.displayInfo();
            this.major = major;
            System.out.println("major"+major);
        }
    }

    class Teacher extends Person {

        String department;

        public Teacher(String id, String homeTown, Date dateofBirth) {
            super(id, homeTown, dateofBirth);
            this.department = department;
        }

        public void displayInfo() {
            super.displayInfo();
            this .department = department;
            System.out.println("department: "+department);
        }
    }

}
