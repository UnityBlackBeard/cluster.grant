package ru.unity.cluster.grant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Users")
public class UsersEntity {
    @Id
    private int id;
    private String name;
    private UsersRoles role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsersRoles getRole() {
        return role;
    }

}
