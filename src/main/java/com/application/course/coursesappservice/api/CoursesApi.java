package com.application.course.coursesappservice.api;

import com.application.course.coursesappservice.Entity.Courses;
import com.application.course.coursesappservice.service.CoursesService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path="/courses")
public class CoursesApi {

    private CoursesService service;

    public CoursesApi(CoursesService service) {
        this.service = service;
    }

    @GetMapping(path="/getAllCourses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Courses> getAllCourses(){
        return service.getAllCourses();
    }

    @GetMapping(path="/getCourse/{courseId}")
    public Courses getCoursebyId(@PathVariable("courseId") Integer courseId){
        return service.getCourseById(courseId);
    }

}
