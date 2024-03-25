package service;

import dao.StudentDao;

public class StudentService {
    private StudentDao studentDao;
    public void serviceMethod() {
        System.out.println("Service method");
        studentDao.daoMethod();
    }

    public StudentService() {
        System.out.println("Service 无参构造方法");
    }

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
        System.out.println("Student 有参构造方法");
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
