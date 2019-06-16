package com.application.course.coursesappservice.service;

import com.application.course.coursesappservice.Entity.Author;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface AuthorsService {
    List<Author> getAllAuthors();
}
