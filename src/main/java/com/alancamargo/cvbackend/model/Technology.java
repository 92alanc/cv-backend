package com.alancamargo.cvbackend.model;

public class Technology {

    private long id;
    private String name;

    public Technology() { }

    public Technology(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
