package co.com.poli.segunclasdb.repository;

import co.com.poli.segunclasdb.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //opcional porque hereda de una clase que ya la implementa
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
