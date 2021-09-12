package com.example.baitap1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BaiTap1Application {
    @Autowired
    StudentRepository repository;
    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(BaiTap1Application.class, args);
        StudentRepository repository = context.getBean(StudentRepository.class);
        inSertStudent(repository);
        System.out.println(getDS(repository));
        System.out.println(getStudent(repository));
        updateStudent(repository);
      //  deleteStudent(repository);

    }



    public static void inSertStudent(StudentRepository repository){
        Student student = new Student();
        student.setEmail("taminhduc12a2@gmail.com");
        student.setHoTen("Ta Minh Duc");
        student.setLopHoc("DHKTPM12BTT");
        repository.save(student);
    }

    private static void deleteStudent(StudentRepository repository){
        repository.deleteById(Long.valueOf(1));
    }
    private static void updateStudent(StudentRepository repository){
        List<Student> studentList= repository.findStudentByHoTen("Ta Minh Duc");
        Student student = studentList.get(0);
        student.setHoTen("Ta Minh Tam");
        student.setEmail("taminhtam@gmail.com");
        repository.save(student);
    }
    private static Optional<Student> getStudent(StudentRepository repository){
        Optional<Student> std = Optional.of(new Student());
        std = repository.findById(Long.valueOf(5));
        return std;
    }
    private static ArrayList<Student> getDS(StudentRepository repository){
        ArrayList<Student> list = new ArrayList<>();
        list = (ArrayList<Student>) repository.findAll();
        return list;
    }
}
