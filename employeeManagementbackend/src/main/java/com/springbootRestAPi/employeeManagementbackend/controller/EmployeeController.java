package com.springbootRestAPi.employeeManagementbackend.controller;

import com.springbootRestAPi.employeeManagementbackend.model.Employee;
import com.springbootRestAPi.employeeManagementbackend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService; //this the instance of the Employee Service

    //save an employee
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    //getting all the empployee
    @GetMapping()
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    //getting just one employee here from the db
    @GetMapping("/{id}")
    public Optional<Employee>getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    //updagting an employee
    @PutMapping ("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }
    //delete an existing employee
    @DeleteMapping ("/{id}")
    public void deleteEmployee (@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
