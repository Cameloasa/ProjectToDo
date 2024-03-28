package org.example;

public class AppUser {

    private String username;
    private String password;
    private AppRole role;
    // Constructor
    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    //Getters
    public String getUsername() {

        return username;
    }
    public void setUsername(String username) {
        if(username == null) throw new IllegalArgumentException("First name should not be empty");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    // Setters

    public void setPassword(String password) {
        if(password == null) throw new IllegalArgumentException("First name should not be empty");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if(role == null) throw new IllegalArgumentException("First name should not be empty");
        this.role = role;
    }

    @Override
    public String toString() {

        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }


    @Override
    public int hashCode() { //todo
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) { //todo
        return super.equals(obj);
    }
}
