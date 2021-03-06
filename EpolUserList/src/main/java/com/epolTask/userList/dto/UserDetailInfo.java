package com.epolTask.userList.dto;

import com.epolTask.userList.model.Car;
import com.epolTask.userList.model.Role;
import com.epolTask.userList.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDetailInfo {

    private String name;

    private String surname;

    private String username;

    private List<CarMinInfo> cars = new ArrayList<>();

    private List<RoleInfo> roles = new ArrayList<>();

    public UserDetailInfo(User user) {
        name = user.getName();
        surname = user.getSurname();
        username = user.getUsername();

        for (Car car : user.getCars())
            cars.add(new CarMinInfo(car));

        for (Role role : user.getRoles())
            roles.add(new RoleInfo(role));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<CarMinInfo> getCars() {
        return cars;
    }

    public void setCars(List<CarMinInfo> cars) {
        this.cars = cars;
    }

    public List<RoleInfo> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleInfo> roles) {
        this.roles = roles;
    }
}
