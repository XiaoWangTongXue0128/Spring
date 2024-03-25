package controller;

import service.StudentService;

public class StudentController {

    private StudentService studentService;
    public void controllerMethod() {
        System.out.println("Controller method");
        studentService.serviceMethod();
    }


    public StudentController() {
        System.out.println("Controller 无参构造方法");
    }

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
        System.out.println("Controller 有参构造方法");
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
