package com.application.course.coursesappservice.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "authors")
public class Author {

    @Id
    private ObjectId _id;

    private int authorId;
    private String name;
}
