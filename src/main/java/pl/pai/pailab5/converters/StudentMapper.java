package pl.pai.pailab5.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.pai.pailab5.domain.Student;
import pl.pai.pailab5.dtos.StudentDto;

@Mapper
public interface StudentMapper {
    @Mapping(target = "name", source = "student.name")
    @Mapping(target = "surname", source = "student.surname")
    @Mapping(target = "age", source = "student.age")
    @Mapping(target = "street", source = "student.address.street")
    @Mapping(target = "city", source = "student.address.city")
    @Mapping(target = "state", source = "student.address.state")
    @Mapping(target = "zip", source = "student.address.zip")
    StudentDto mapStudentToStudentDto(Student student);
}
