package co.com.poli.segunclasdb.services;

import co.com.poli.segunclasdb.entities.Course;
import co.com.poli.segunclasdb.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImple implements CourseService{

    @Autowired
    private CourseRepository repository;

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }

    @Override
    public Course create(Course course) {
        return repository.save(course);
    }
}
