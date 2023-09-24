package com.curlybrat.EmployeeManagement.Service;

import com.curlybrat.EmployeeManagement.Entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface employeeService {

    ResponseEntity<List<Employee>> getAllEmployees();

    ResponseEntity<Employee> addEmployee(Employee employee);

    ResponseEntity<Employee> getEmployeeById(long id);

    ResponseEntity<String> deleteEmployee(long id);
}
