package com.curlybrat.EmployeeManagement.Controller;

import com.curlybrat.EmployeeManagement.Entity.Employee;
import com.curlybrat.EmployeeManagement.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    employeeService service;

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        return service.getEmployeeById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable long id){
        service.deleteEmployee(id);
    }
}