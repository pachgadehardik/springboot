package com.myfirstapp.model;

public class User {

    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
=======

        String str = (firstName!=null)?firstName+"" : "";
        str+=(lastName!=null)? lastName : "";
        return str.trim();
>>>>>>> greeting-app-save-retrieve-h2
    }
}
