package com.application.course.coursesappservice.service;

import com.application.course.coursesappservice.Entity.Author;
import com.application.course.coursesappservice.repository.AuthorsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsServiceImpl implements AuthorsService {

    private AuthorsRepo repo;

    public AuthorsServiceImpl(AuthorsRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Author> getAllAuthors() {
        return repo.findAll();
    }
}
