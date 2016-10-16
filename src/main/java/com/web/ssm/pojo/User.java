package com.web.ssm.pojo;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -7502752852257535970L;

	private Long id;

    private String name;

    private Short age;

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
        this.name = name == null ? null : name.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }
}