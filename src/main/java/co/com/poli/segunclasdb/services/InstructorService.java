package co.com.poli.segunclasdb.services;

import co.com.poli.segunclasdb.entities.Instructor;

import java.util.List;

public interface InstructorService {

    List<Instructor> findAll();
    Instructor createInstructor(Instructor instructor);

}
