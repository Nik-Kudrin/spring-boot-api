package com.neon.api.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rooms")
public class Room {

    // for id generation
    @Transient
    public static final String SEQUENCE_NAME = "room_sequence";

    @Id
    private long id;
    private final String description;

    public Room(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }
}