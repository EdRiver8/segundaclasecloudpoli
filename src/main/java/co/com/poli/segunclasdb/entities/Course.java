package co.com.poli.segunclasdb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "courses")
public class Course extends EntityBase{


    /* lo hereda de la clase EntityBase
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     */
    @Column(name = "name") //es opcional, sino se pone el toma el nombre del atributo para la columna
    private String name;
    @JsonBackReference //solo trae los datos del instructor al llamarlo
    @ManyToOne(fetch = FetchType.EAGER) //carga rapida
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /* lo hereda de la clase EntityBase
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    */
}
