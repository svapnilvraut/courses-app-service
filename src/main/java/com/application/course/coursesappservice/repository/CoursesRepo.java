package com.application.course.coursesappservice.repository;

import com.application.course.coursesappservice.Entity.Courses;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepo extends MongoRepository<Courses, ObjectId> {
    Courses findByCourseId(Integer courseId);
}
