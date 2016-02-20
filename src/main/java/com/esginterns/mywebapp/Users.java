package com.esginterns.mywebapp;

/**
 * Created by User on 2/19/2016.
 */
public class Users {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    Users(){};
    Users(int id,String firstName,String lastName,String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
    return "FirstName: "+firstName+"\n"+
            "LastName: "+lastName+"\n"+
            "e-mail: "+email;
    }

}
