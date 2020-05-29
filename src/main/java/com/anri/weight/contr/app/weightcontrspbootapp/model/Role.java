package com.anri.weight.contr.app.weightcontrspbootapp.model;

import javax.persistence.*;
//import javax.validation.constraints.NotNull;

@Entity
@Table(name = "role")
public class Role {

    public Role() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;

    @Column(name = "role_name")
    //@NotNull
    private String role;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
