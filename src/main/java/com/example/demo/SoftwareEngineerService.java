package com.example.demo;

import jakarta.transaction.Transactional;
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
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Engineer not found"));
    }

    @Transactional
    public void saveEngineer(SoftwareEngineer engineer) {
        repository.save(engineer);
    }

    public void deleteEngineer(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Engineer not found");
        }
        repository.deleteById(id);
    }
}
