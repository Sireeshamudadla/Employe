package com.org.cts.service;

import com.org.cts.model.Employee;
import com.org.cts.repo.EmpRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceImplTest {

    @InjectMocks
    private ServiceImpl  serviceImpl;

    @Mock
    private EmpRepository empRepository;

    @Test
    void createEmployee() {
        Employee employee=new Employee();
        employee.setId(100);
        employee.setName("siri");
        employee.setPno(2345.6);
        employee.setAddress("blr");
        Mockito.when(empRepository.save(employee)).thenReturn(employee);
        serviceImpl.createEmployee(employee);

    }

    @Test
    void updateEmployee() {
        Employee employee=new Employee();
        employee.setId(100);
        employee.setName("siri");
        employee.setPno(2345.6);
        employee.setAddress("blr");
        Mockito.when(empRepository.save(employee)).thenReturn(employee);
        serviceImpl.updateEmployee(employee);

    }

    @Test
    void getAllEmployee() {
        List<Employee> list=new ArrayList<>();
        Employee employee=new Employee();
        employee.setId(100);
        employee.setName("siri");
        employee.setPno(2345.6);
        employee.setAddress("blr");
        list.add(employee);
        Employee employee2=new Employee();
        employee2.setId(101);
        employee2.setName("siri");
        employee2.setPno(2345.6);
        employee2.setAddress("blr");
        list.add(employee2);
        Mockito.when(empRepository.findAll()).thenReturn(list);
        List<Employee> list2  = serviceImpl.getAllEmployee();
        Assertions.assertEquals(list,list2);
    }

    @Test
    void findEmployeeById() {
        Integer id=100;
        Employee employee=new Employee();
        employee.setId(100);
        employee.setName("siri");
        employee.setPno(2345.6);
        employee.setAddress("blr");
        Mockito.when(empRepository.getById(id)).thenReturn(employee);
        Employee employee1  =serviceImpl.findEmployeeById(id);
        Assertions.assertEquals(employee,employee1);
    }

    @Test
    void deleteByAddress() {
        String address="blr";
        String value="s";

        String value1= serviceImpl.deleteByAddress(address);
        Assertions.assertEquals(value,value1);

    }
}