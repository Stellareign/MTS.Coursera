package org.application.repository;

import org.application.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    public Course findByTitle(String title);
    public Course findById(int id);
}
