package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository repository;

    public SoftwareEngineerService(SoftwareEngineerRepository repository) {
        this.repository = repository;
    }

    public List<SoftwareEngineer> getAllEngineers() {
        return repository.findAll();
    }

    public SoftwareEngineer getEngineerById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public SoftwareEngineer saveEngineer(SoftwareEngineer engineer) {
        return repository.save(engineer);
    }

    public void deleteEngineer(Integer id) {
        repository.deleteById(id);
    }
}
