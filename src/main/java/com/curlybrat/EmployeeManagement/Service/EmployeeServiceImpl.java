package com.curlybrat.EmployeeManagement.Service;

import com.curlybrat.EmployeeManagement.Dao.EmployeeRepository;
import com.curlybrat.EmployeeManagement.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements employeeService{

    @Autowired
    EmployeeRepository empDao;
    @Override
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(empDao.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> addEmployee(Employee employee) {
        return new ResponseEntity<>(empDao.save(employee),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(long id) {
        return new ResponseEntity<>(empDao.findById(id).get(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteEmployee(long id) {
        empDao.deleteById(id);
        return new ResponseEntity<>("Successfully Deleted",HttpStatus.OK);
    }
}
