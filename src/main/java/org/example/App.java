package org.example;

import java.time.LocalDate;
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

        ToDoItem item1 = new ToDoItem("Make your own code", "Java");
        ToDoItem item2 = new ToDoItem("Make your own bread", "Cuisine");
        item1.setIdToDo(1);
        item1.setDeadLine(LocalDate.of(2024, 03, 30));
        item1.setDone(false);
        item2.setDeadLine(LocalDate.of(2024, 03, 21));
        item2.setDone(true);
        item2.setIdToDo(2);
        System.out.println(item1.getSummary());
        System.out.println(item2.getSummary());
        if (item1.isOverdue()) {
            System.out.println("Deadline is overdue.");
        } else {
            System.out.println("Deadline is not yet overdue.");
        }
        if (item2.isOverdue()) {
            System.out.println("Deadline is overdue.");
        } else {
            System.out.println("Deadline is not yet overdue.");
        }

        ToDoItemTask task1 = new ToDoItemTask();
        task1.setToDoItemTask(task1);
        task1.setAssigned(true);
        task1.setAssignee(person1);
        System.out.println(task1.getSummary());


    }
}
