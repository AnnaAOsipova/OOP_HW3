package model;

public abstract class User {

    public User(String name, String lastName, String surName) {
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
    }

    private String name;
    private String surName;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
