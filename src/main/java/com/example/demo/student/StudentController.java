package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/student")
public class StudentController {


    private final StudentService studentService;

    // genero un constructor que recibe studenServices
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }




    @GetMapping
    public List<Student> getStudents(){

        // llamo a el metodo get Student desde StudentSerrvices
return studentService.getStudents();

}



}
