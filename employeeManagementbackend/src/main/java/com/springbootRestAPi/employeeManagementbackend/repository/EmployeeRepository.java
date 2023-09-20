package com.springbootRestAPi.employeeManagementbackend.repository;

import com.springbootRestAPi.employeeManagementbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
