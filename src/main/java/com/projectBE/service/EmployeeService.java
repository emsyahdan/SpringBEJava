package com.projectBE.service;

import com.projectBE.entity.Employee;
import com.projectBE.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository empRepository;

    public List<Employee> listAll() {
        return empRepository.findAll();
    }

    public void save(Employee employee) {
        empRepository.save(employee);
    }

    public Employee get(Long id) {
        return empRepository.findById(id).get();
    }

    public void delete(Long id) {
        empRepository.deleteById(id);
    }
}
