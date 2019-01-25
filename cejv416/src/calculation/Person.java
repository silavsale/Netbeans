/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

/**
 *
 * @author PIRUZ
 */
public class Person {
    
    String name = "David";
    int yearOfBirth = 0;
    int year = 0;
    int age = 0;
    int numberOfMonths = 0;
    int numberOfDays = 0;
    
    public void sayAge()
    {
        System.out.println("My name is:" + name);
        System.out.println("I'm:" + (year - yearOfBirth));
        System.out.println("Number of months:" + (year - yearOfBirth)*numberOfMonths);
        System.out.println("Number of days:" + (year - yearOfBirth)*numberOfDays);
        
    }
}
    
