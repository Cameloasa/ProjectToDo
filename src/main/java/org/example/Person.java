package org.example;

public class Person {

    // Fields private

    private int id;
    private String firstName; // not allowed to be null
    private String lastName; // not allowed to be null
    private String email; // not allowed to be null



        // Constructors

    

    public Person(String firstName,String lastName,String email){
    setFirstName(firstName);
    setLastName(lastName);
    setEmail(email);
    this.id = getId();
    }
    public Person(){
        this.id = getId();
        this.email = getEmail();

    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if(firstName == null) throw new IllegalArgumentException("First name should not be empty");
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Last name should not be empty");
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email should not be empty");
        this.email = email;
    }
    // Methods




    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // Method for get summary should be String


    public String getSummary(){
       return "Person Info: First Name: " + firstName + ", Last Name: " + lastName + ", email: " + email + ", Id: " + id;

    }


}



