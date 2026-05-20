package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "Prudhvee Rao", "DevOps"));
        employees.add(new Employee(2L, "John Doe", "Engineering"));
        return employees;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return new Employee(id, "Prudhvee Rao", "DevOps");
    }
}
