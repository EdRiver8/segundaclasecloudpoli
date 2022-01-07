package co.com.poli.segunclasdb.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Setter
@Getter
@Table(name = "Instructors")
public class Instructor extends EntityBase{

    /* lo hereda de la clase EntityBase
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    */
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JsonManagedReference //este es el que controla, cuando se llame a un instructor, se trae la lista de cursos, y no al contrario
    private List<Course> courses;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* lo hereda de la clase EntityBase
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
     */
}
