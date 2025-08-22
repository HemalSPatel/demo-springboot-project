package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/software-engineers")
public class SoftwareEngineerController {

    @GetMapping("/all")
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
            new SoftwareEngineer(
                1,
                "Alice",
                List.of("Java", "Spring Boot", "Docker")
            ),
            new SoftwareEngineer(
                2,
                "Bob",
                List.of("Python", "Django", "PostgreSQL")
            ),
            new SoftwareEngineer(
                3,
                "Charlie",
                List.of("JavaScript", "React", "Node.js")
            )
        );
    }
}
