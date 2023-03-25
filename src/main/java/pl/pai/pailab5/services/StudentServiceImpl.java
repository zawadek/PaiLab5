package pl.pai.pailab5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pai.pailab5.converters.StudentConverter;
import pl.pai.pailab5.converters.StudentMapper;
import pl.pai.pailab5.dtos.StudentDto;
import pl.pai.pailab5.repositories.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;
    private final StudentMapper studentMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        return (List<StudentDto>)studentRepository.findAll()
                //.stream().map(studentConverter::convert)
                .stream().map(studentMapper::mapStudentToStudentDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<StudentDto> getAllStudentsNoAttachment(){
        return studentRepository.findAllNoAttachment();
    }
}
