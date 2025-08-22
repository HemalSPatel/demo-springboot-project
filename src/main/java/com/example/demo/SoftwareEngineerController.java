package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping("/all")
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getAllEngineers();
    }

    @GetMapping("/{id}")
    public SoftwareEngineer getAnEngineerById(Integer id) {
        return softwareEngineerService.getEngineerById(id);
    }

    @PostMapping
    public SoftwareEngineer createEngineer(SoftwareEngineer engineer) {
        return softwareEngineerService.saveEngineer(engineer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnEngineer(Integer id) {
        softwareEngineerService.deleteEngineer(id);
    }
}
