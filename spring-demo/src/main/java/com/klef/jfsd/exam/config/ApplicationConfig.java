package com.klef.jfsd.exam.config;

import com.klef.jfsd.exam.model.Employee;
import com.klef.jfsd.exam.model.Course;
import com.klef.jfsd.exam.model.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
public class ApplicationConfig {

    @Bean
    public Employee employee() {
        return new Employee(1, "John Doe", 50000.0, true, Arrays.asList("Java", "Spring", "SQL"));
    }

    @Bean
    public Instructor instructor() {
        return new Instructor(101, "Dr. Smith", "dr.smith@example.com", "1234567890");
    }

    @Bean
    public Course course() {
        return new Course(301, "Spring Framework", 3, instructor());
    }
}
