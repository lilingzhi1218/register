package controller;

import entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @GetMapping(value = "/getAllStudent")
    public Student getAllStudent(){
        Student student = new Student();
        student.setAge("18");
        student.setName("llz");
        student.setSex("male");
        return student;
    }
    
}
