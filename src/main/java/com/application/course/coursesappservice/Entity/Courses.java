package com.application.course.coursesappservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "courses")
public class Courses {

    @Id
    private ObjectId _id;
    private int courseId;
    private String title;
    private String duration;
    private Author author;
}
