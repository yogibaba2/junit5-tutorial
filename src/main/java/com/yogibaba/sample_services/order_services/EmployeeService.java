package com.yogibaba.sample_services.order_services;

import java.time.LocalDateTime;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee create(Employee employee) {
        employee.setJoiningDate(LocalDateTime.now());
        return employeeRepository.save(employee);
    }
}
