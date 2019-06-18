package com.application.course.coursesappservice.service;

import com.application.course.coursesappservice.Entity.Courses;
import com.application.course.coursesappservice.repository.CoursesRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CoursesServiceImpl implements CoursesService {

    private CoursesRepo repo;

    @Override
    public List<Courses> getAllCourses() {
        return repo.findAll();
    }

    @Override
    public Courses getCourseById(Integer courseId){
        return repo.findByCourseId(courseId);
    }

    @Override
    public void saveCourse(Courses course) {
        repo.save(course);
    }
}
