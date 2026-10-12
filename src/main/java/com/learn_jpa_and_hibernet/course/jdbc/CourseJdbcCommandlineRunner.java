package com.learn_jpa_and_hibernet.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandlineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Pytho", "28minutes"));
        repository.insert(new Course(2, "Java", "28minutes"));
        repository.insert(new Course(3, "Angular", "28minutes"));
    }
}
