package com.deba1708.journalApp.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "users")
@Data
public class User {
    @Id
    ObjectId id;
    @Indexed(unique = true)
    @NonNull
    String userName;
    @NonNull
    private String password;

    @DBRef
    private List<JournalEntry> journalEntries=new ArrayList<>();

    private List<String> roles;
}

// Document is for Interact with Database which field and collections are to be created