package com.epolTask.userList.model;

public class User {
    private String id;
    private String name;
    private String surname;

    public User() {
    }

    public User(String id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }
}
