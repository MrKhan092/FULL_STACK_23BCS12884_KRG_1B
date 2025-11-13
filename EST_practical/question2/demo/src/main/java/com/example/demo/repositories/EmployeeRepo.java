package com.example.demo.repositories;

import com.example.demo.entities.EmployeeEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntitiy, Long> {

}
