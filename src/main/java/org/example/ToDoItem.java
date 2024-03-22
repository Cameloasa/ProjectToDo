package org.example;

import java.time.LocalDate;

public class ToDoItem {

    //Fields
    private int idToDo; // representing each To Do element
    private String title ; // ex make your own code, Not allowed to be null
    private String taskDescription; // hold further information
    private LocalDate deadLine; // not allowed to be null
    private boolean done; // if task is finished
    private Person creator;


    // Constructor

    public ToDoItem(String title, String taskDescription, boolean done){
        setTitle(title);
        setTaskDescription(taskDescription);
        setDeadLine(deadLine);
    }


    //Getters and setter

    public void setIdToDo(int idToDo) {
        this.idToDo = idToDo;
    }

    public int getIdToDo() {
        return idToDo;
    }


    public void setTitle(String title) {
        if(title == null) throw new IllegalArgumentException("This field should not be empty");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }


    public LocalDate getDeadLine() {

        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if(deadLine == null) throw new IllegalArgumentException(" deadline is overdue");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done){
        this.done = done;
    }


    public void setCreator(Person creator) {
       this.creator = creator;

    }

    public Person getCreator(){
        return creator;
    }
    //Method to get summary

    public boolean isOverdue(){
        return LocalDate.now().isAfter(deadLine);

    }
    public String getSummary (){
        return "Info : : title" + title + ", Task Description: " + taskDescription + ", dead line: " + deadLine + ", id: " + idToDo;

    }




}
