package co.com.poli.segunclasdb.services;

import co.com.poli.segunclasdb.entities.Course;

import java.util.List;

public interface CourseService {

    List<Course> findAll();
    Course create(Course course);

}
