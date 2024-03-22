package org.example;

import java.util.*;


public class App 
{
    public static void main( String[] args ) {

        Person person0 = new Person();
        person0.getSummary();

        Person person1 = new Person("Erik", "Sten" ,"test@test");
        person1.setId(1);
        System.out.println(person1.getSummary());


        Person person2 = new Person("Joe", " Doe", "test@gmail.com");
        person2.setId(2);
        System.out.println(person2.getSummary());






    }
}
