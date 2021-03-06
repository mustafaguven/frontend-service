package com.mg.front_end.model;

import lombok.Getter;
import lombok.Setter;

public class Catalog {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    public Catalog(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

