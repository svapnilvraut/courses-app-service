package com.application.course.coursesappservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CoursesAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesAppServiceApplication.class, args);
	}

}
