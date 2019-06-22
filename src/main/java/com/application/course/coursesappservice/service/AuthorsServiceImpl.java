package com.application.course.coursesappservice.service;

import com.application.course.coursesappservice.Entity.Author;
import com.application.course.coursesappservice.repository.AuthorsRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AuthorsServiceImpl implements AuthorsService {

    private AuthorsRepo repo;

    @Override
    public List<Author> getAllAuthors() {
        return repo.findAll();
    }
}
