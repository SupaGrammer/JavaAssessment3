package user_management;

import user_management.security.Password;

/**
 * @TODO
 * Simple POJO like the previous
 * This class should just consist of fields , getters and setters
 * ToString() method will be overridden here with custom output (name associated with email)
 * Equals method will also be overridden to check if 2 passwords are the same?
 */

public class User {
    //fields
    public User user;
    private int id;
    private String name;
    private String email;
    private String password;

    public User(int id, String name, String email, Password password) {
        this.id = id;
        this.name = name;
        this.email = email;
        //this.password = Password(password);
    }

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        //this.password = password;
    }

    @Override //custom toString method that appends the email after username to a string
    public String toString() {
        return this.name + " - " + this.email;
    }

    @Override //a custom comparator method???
    public boolean equals(Object obj) {
        return false;
    }

//    public void setPassword(Password password) {
//        this.password = password;
//    }
//
//    public Password getPassword() {
//        return this.password;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}