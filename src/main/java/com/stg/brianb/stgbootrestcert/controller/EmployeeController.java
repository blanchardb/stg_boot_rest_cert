package com.stg.brianb.stgbootrestcert.controller;

import com.stg.brianb.stgbootrestcert.model.Employee;
import com.stg.brianb.stgbootrestcert.service.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public Employee getEmployee(@PathParam("id") Long id) {
        return this.employeeService.getEmployee(id);
    }

    @PostMapping()
    public Employee saveEmployee(@RequestBody Employee employee) {
        return this.employeeService.saveEmployee(employee);
    }

    @PutMapping()
    public void updateEmployee(@RequestBody Employee employee) {
        this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping()
    public void deleteEmployee(@PathParam("id") Long id) {
        this.employeeService.deleteEmployee(id);
    }
}
