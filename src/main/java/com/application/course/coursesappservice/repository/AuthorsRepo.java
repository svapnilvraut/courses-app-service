package com.application.course.coursesappservice.repository;

import com.application.course.coursesappservice.Entity.Author;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepo extends MongoRepository<Author, ObjectId> {
}
