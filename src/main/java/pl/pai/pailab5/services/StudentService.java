package pl.pai.pailab5.services;

import pl.pai.pailab5.dtos.StudentDto;

import java.util.List;

public interface StudentService {

    public List<StudentDto> getAllStudents();
    public List<StudentDto> getAllStudentsNoAttachment();
}
