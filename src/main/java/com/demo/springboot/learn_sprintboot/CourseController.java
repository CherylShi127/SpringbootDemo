package com.demo.springboot.learn_sprintboot;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "Cheryl"),
                new Course(2, "Learn Devops", "Cheryl"),
                new Course(3, "Learn Azure", "Cheryl"),
                new Course(5, "Spring", "John")
        );
    }
}
