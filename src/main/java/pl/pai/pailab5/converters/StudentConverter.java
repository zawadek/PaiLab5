package pl.pai.pailab5.converters;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.springframework.stereotype.Component;
import pl.pai.pailab5.domain.Student;
import pl.pai.pailab5.dtos.StudentDto;

@Component
public class StudentConverter implements Converter<Student, StudentDto> {

    @Override
    public StudentDto convert(Student source) {
        return StudentDto.builder()
                .name(source.getName())
                .surname(source.getSurname())
                .age(source.getAge())
                .state(source.getAddress().getState())
                .city(source.getAddress().getCity())
                .street(source.getAddress().getStreet())
                .zip(source.getAddress().getZip())
                .build();
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }
}
