package test;

import controller.StudentController;
import dao.StudentDao;
import domain.Computer;
import domain.Room;
import domain.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        BeanFactory factory = new FileSystemXmlApplicationContext();

//        Student student1 = (Student) factory.getBean("student");
//        System.out.println(student1);
//        StudentController controller = (StudentController) factory.getBean("studentcontroller");
//
//        controller.controllerMethod();
//        StudentDao dao = (StudentDao) factory.getBean("studentdao");
//        System.out.println(dao);
        BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Room room = (Room) factory.getBean("room");
//        System.out.println(room);


        Computer computer = (Computer) factory.getBean("computer");
        System.out.println(computer);
    }
}
