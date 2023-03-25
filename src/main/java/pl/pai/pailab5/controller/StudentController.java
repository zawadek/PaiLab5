package pl.pai.pailab5.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pai.pailab5.dtos.StudentDto;
import pl.pai.pailab5.services.StudentServiceImpl;

import java.util.List;

@RequestMapping(value = "/students")
@RequiredArgsConstructor
@RestController
public class StudentController {

    private final StudentServiceImpl studentService;

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
}
