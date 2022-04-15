package com.tegaistega.scheduling.service;

import com.tegaistega.scheduling.entity.Employee;
import com.tegaistega.scheduling.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createNewEmployee(){
        log.info("create employee");
        Employee employee = new Employee();
        employee.setFirstname("Tega");
        employee.setLastname("Isiboge");
        employee.setSalary(800000.0);
        employee.setPosition("CEO");
        log.info("all set");

        employeeRepository.save(employee);
        log.info("saved employee");
        return employee;
    }


}
