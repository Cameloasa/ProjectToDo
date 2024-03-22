package org.example;

public class ToDoItemTask {

    // Fields
    private int idTsk;
    private boolean assigned; // set true if assignee is not null
    private ToDoItem  toDoItem; // ToDoItem class - not null
    private Person assignee; // Person class

    // Constructors --add more


    // Getters and Setters
    public int getIdTsk() {
        return idTsk;
    }

    public boolean isAssigned() {return assigned;}

    public void setAssigned(boolean assigned){
        this.assigned = assigned;
    }

    public void setToDoItem(ToDoItem toDoItem) {
        if(toDoItem == null) throw new IllegalArgumentException("First field should not be empty");
        this.toDoItem = toDoItem;
    }

    public ToDoItem getToDoItem(){
        return toDoItem;
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



    // Methods
}
