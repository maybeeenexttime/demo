package com.example.demo.config;

import com.example.demo.repository.StudentRepository;
import com.example.demo.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
//            Student Alymkan =
//            new Student(
//                    "Alymkan Karybaeva",
//                    LocalDate.of(1997, DECEMBER, 12),
//                     "karybaeva@mail.ru");
//
//            Student Aisuluu =
//                    new Student(
//                            "Aisuluu Djumaeva",
//                            LocalDate.of(1998, AUGUST, 14),
//                            "ais_23_ice@mail.ru");
//
//            studentRepository.saveAll(List.of(Alymkan, Aisuluu));
//
        };
    }
}
