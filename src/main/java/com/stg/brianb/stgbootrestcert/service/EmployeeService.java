package com.stg.brianb.stgbootrestcert.service;

import com.stg.brianb.stgbootrestcert.model.Employee;
import com.stg.brianb.stgbootrestcert.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployee(Long id) {
        Optional<Employee> optional = this.employeeRepository.findById(id);
        return optional.orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.saveAndFlush(employee);
    }

    public void updateEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = optional.orElse(null);
        if(employee != null) {
            employeeRepository.delete(employee);
        }
    }
}
