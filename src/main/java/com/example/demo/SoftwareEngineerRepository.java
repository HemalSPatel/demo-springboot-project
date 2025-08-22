package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer,Integer> {
    // This interface will automatically provide CRUD operations for SoftwareEngineer entities

}
