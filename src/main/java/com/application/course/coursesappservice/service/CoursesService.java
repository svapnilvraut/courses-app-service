package com.application.course.coursesappservice.service;

import com.application.course.coursesappservice.Entity.Courses;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CoursesService {
    List<Courses> getAllCourses();

    Courses getCourseById(Integer courseId);

    void saveCourse(Courses course);

    void deleteCourse(Integer courseId);
}
