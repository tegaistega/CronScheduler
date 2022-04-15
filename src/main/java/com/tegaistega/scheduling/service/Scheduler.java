package com.tegaistega.scheduling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler{

    @Autowired
    EmployeeService employeeService;

    @Scheduled(cron = "*/2 * * * * *")
    public void performTask(){
        employeeService.createNewEmployee();
    }
}