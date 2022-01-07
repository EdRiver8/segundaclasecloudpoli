package co.com.poli.segunclasdb.controller;

import co.com.poli.segunclasdb.entities.Course;
import co.com.poli.segunclasdb.entities.Instructor;
import co.com.poli.segunclasdb.services.CourseService;
import co.com.poli.segunclasdb.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private InstructorService service;

    @GetMapping
     public List<Instructor> findAll(){
         return service.findAll();
     }

     @PostMapping
     public Instructor create(Instructor instructor){
        return service.createInstructor(instructor);
     }

}
