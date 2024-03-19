package org.example;

import java.time.LocalDate;

public class ToDoItem {

    //Fields
    private int id; // representing each To Do element
    private String title ;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private String creator; // Person class


    // Constructor 1

    public ToDoItem(int id, String title,String taskDescription,boolean done, LocalDate deadLine, String creator) {
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.done = done;
        this.deadLine = deadLine;
        this.creator = creator;

    }

    // Constructor 2

    public ToDoItem(String creator) {
        this.creator = creator;
    }


    //Methods


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        if(title == null) throw new IllegalArgumentException("This field should not be empty");
        this.title = title;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeadLine(LocalDate deadLine) { // Local Date
        this.deadLine = deadLine;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public String getCreator() {
        return creator;
    }

    //Method to get summary

    // todo continue and local data & boolean

    public void getSummary (){
        System.out.println("Info : : title" + title + ", Task Description: " + taskDescription + ", dead line: " + deadLine + ", id: " + id );

    }

    // Method to check if task is overdue

    public boolean isOverdue(){
        return LocalDate.now().isAfter(deadLine);

    }
}
