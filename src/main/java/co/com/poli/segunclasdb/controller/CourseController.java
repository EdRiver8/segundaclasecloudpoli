package co.com.poli.segunclasdb.controller;

import co.com.poli.segunclasdb.entities.Course;
import co.com.poli.segunclasdb.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course> findAll(){
        return service.findAll();
    }

    @PostMapping
    public Course create(Course course){
        return service.create(course);
    }

}
