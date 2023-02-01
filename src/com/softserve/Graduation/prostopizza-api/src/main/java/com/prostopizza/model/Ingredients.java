package com.prostopizza.model;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class Ingredients {

    @Id
    @Column(name = "id")
    long id;
    @Column(name = "name")
    String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
