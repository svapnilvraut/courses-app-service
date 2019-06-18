package com.application.course.coursesappservice.api;

import com.application.course.coursesappservice.Entity.Courses;
import com.application.course.coursesappservice.service.CoursesService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/courses")
@AllArgsConstructor
@Slf4j
public class CoursesApi {

    private CoursesService service;

    @GetMapping(path="/getAllCourses", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Courses> getAllCourses(){
        return service.getAllCourses();
    }

    @GetMapping(path="/getCourse/{courseId}")
    public Courses getCoursebyId(@PathVariable("courseId") Integer courseId){
        return service.getCourseById(courseId);
    }

    @PostMapping(path="/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveCourse(@RequestBody Courses course){
        service.saveCourse(course);
    }

}
