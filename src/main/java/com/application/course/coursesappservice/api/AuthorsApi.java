package com.application.course.coursesappservice.api;

import com.application.course.coursesappservice.Entity.Author;
import com.application.course.coursesappservice.service.AuthorsService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/authors")
public class AuthorsApi {

    private AuthorsService service;

    public AuthorsApi(AuthorsService service) {
        this.service = service;
    }

    @GetMapping(path="/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Author> getAllAuthors(){
        return service.getAllAuthors();
    }

}