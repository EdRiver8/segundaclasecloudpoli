package co.com.poli.segunclasdb.repository;

import co.com.poli.segunclasdb.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> { //es generico, asi que necesita la clase y que tipo de dato es el campo clave

}
