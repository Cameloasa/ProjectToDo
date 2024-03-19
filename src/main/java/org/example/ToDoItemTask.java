package org.example;

public class ToDoItemTask {

    // Fields
    private int id;
    private boolean assigned;
    private String [] toDoItem; // ToDoItem class
    private String [] assignee; // Person class

    // Constructors --add more
    public ToDoItemTask(String[] assignee) {
        this.assignee = (assignee);
    }

    // Getters and Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public void setToDoItem(String[] toDoItem) {
        this.toDoItem = toDoItem;
    }

    public void setAssignee(String[] assignee) {
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public String[] getToDoItem() {
        return toDoItem;
    }

    public String[] getAssignee() {
        return assignee;
    }

    // Methods
}
