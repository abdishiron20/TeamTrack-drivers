package com.springbootRestAPi.employeeManagementbackend.service;

import com.springbootRestAPi.employeeManagementbackend.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeIServiceInterface {
    public Employee saveEmployee(Employee employee);
    public Optional<Employee>getEmployeeById(int id);
    List<Employee> getAllEmployee();
    Employee updateEmployee(int id, Employee employee);
    void deleteEmployee(int id);
}
