package com.application.course.coursesappservice.service;

import com.application.course.coursesappservice.Entity.Courses;
import com.application.course.coursesappservice.repository.CoursesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {

    private CoursesRepo repo;

    public CoursesServiceImpl(CoursesRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Courses> getAllCourses() {
        return repo.findAll();
    }
}
