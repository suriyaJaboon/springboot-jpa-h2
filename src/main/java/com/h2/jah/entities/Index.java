package com.h2.jah.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INDEX")
public class Index implements Serializable {

    private static final long serialVersionUID = -3061933200898411877L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Boolean action;

    public Index() {
    }

    public Index(String name, Boolean action) {
        this.name = name;
        this.action = action;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAction() {
        return action;
    }

    public void setAction(Boolean action) {
        this.action = action;
    }
}
