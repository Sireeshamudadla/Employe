package com.org.cts.service;

import com.org.cts.model.Employee;
import com.org.cts.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements EmpService {

    @Autowired
    EmpRepository empRepository;


    @Override
    public void createEmployee(Employee employee) {
        empRepository.save(employee);

    }

    @Override
    public void updateEmployee(Employee employee) {
        empRepository.save(employee);


    }

    @Override
    public List<Employee> getAllEmployee() {
      List<Employee> xyz =empRepository.findAll();
       return xyz;
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        Employee em =empRepository.getById(id);
        return em;
    }

    @Override
    public String deleteByAddress(String address) {
        String s=empRepository.deleteByAddress(address);
        return s;
    }

}
