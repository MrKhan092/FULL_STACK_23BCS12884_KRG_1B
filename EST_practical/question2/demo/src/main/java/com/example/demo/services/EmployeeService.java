package com.example.demo.services;

import com.example.demo.entities.EmployeeEntitiy;
import com.example.demo.repositories.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public List<EmployeeEntitiy> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<EmployeeEntitiy> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    public EmployeeEntitiy createEmployee(EmployeeEntitiy employee) {
        return employeeRepo.save(employee);
    }
}
