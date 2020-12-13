package com.neon.api.data.model;

import org.springframework.data.annotation.Id;

public class Room {

    @Id
    private final long id;
    private final String description;

    public Room(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}