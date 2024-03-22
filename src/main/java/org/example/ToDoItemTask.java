package org.example;

public class ToDoItemTask {

    // Fields
    private int idTsk;
    private boolean assigned; // set true if assignee is not null
    private ToDoItemTask  toDoItemTask; // ToDoItem class - not null
    private Person assignee; // Person class

    //Constructor


    public ToDoItemTask(Person assignee) {
        this.assignee = assignee;
        setToDoItemTask(toDoItemTask);
        setAssigned(true);
    }
    public ToDoItemTask(){
        this.idTsk = idTsk;
        this.toDoItemTask = toDoItemTask;

    }

    // Getters and Setters
    public int getIdTsk() {
        return idTsk;
    }

    public boolean isAssigned() {return assigned;}

    public void setAssigned(boolean assigned){
        this.assigned = assigned;
    }

    public void setToDoItemTask(ToDoItemTask toDoItem) {
        if(toDoItem == null) throw new IllegalArgumentException("First field should not be empty");
        this.toDoItemTask = toDoItemTask;
    }

    public ToDoItemTask getToDoItemTask() {
        return toDoItemTask;
    }

    public Person getAssignee(){

       return assignee;
   }

    public void setAssignee(Person assignee) {
        if (assignee == null) {
            throw new IllegalArgumentException("This field should not be empty.");
        }
        this.assignee = assignee;
    }
    public String getSummary() {
        return "Task info: id " + idTsk + "Assigned: " + assigned + "Todo item: " + toDoItemTask + "Assignee: " + assignee + "\n";
    }




}
