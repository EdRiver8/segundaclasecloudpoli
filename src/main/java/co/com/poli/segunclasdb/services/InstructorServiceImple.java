package co.com.poli.segunclasdb.services;

import co.com.poli.segunclasdb.entities.Instructor;
import co.com.poli.segunclasdb.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImple implements InstructorService{

    @Autowired
    private InstructorRepository repository;

    @Override
    public List<Instructor> findAll() {
        return repository.findAll();
    }

    @Override
    public Instructor createInstructor(Instructor instructor) {
        return repository.save(instructor);
    }
}
