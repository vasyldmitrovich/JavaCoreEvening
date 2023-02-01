package com.prostopizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="user_roles")
@Table(name="user_roles")
public class UserRoles {
    @Id
    long user_id;
    @Column(name="roles_id")
    long roles_id;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(long roles_id) {
        this.roles_id = roles_id;
    }
}
