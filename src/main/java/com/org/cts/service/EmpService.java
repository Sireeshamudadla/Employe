package com.org.cts.service;


import com.org.cts.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmpService {
    public void createEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public Employee findEmployeeById(Integer id);
    public String deleteByAddress(String address);
}
