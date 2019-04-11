package com.h2.jah.dtos;

public class IndexDTO {
    private Long id;
    private String name;
    private Boolean action;

    public IndexDTO() {
    }

    public IndexDTO(Long id, String name, Boolean action) {
        this.id = id;
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
