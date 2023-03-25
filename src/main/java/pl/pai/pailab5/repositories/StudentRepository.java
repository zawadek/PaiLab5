package pl.pai.pailab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.pai.pailab5.domain.Student;
import pl.pai.pailab5.dtos.StudentDto;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT new pl.pai.pailab5.dtos.StudentDto(s.name, s.surname, s.age, s.address.street, s.address.city, s.address.state, s.address.zip) from Student s")
    List<StudentDto> findAllNoAttachment();
}
