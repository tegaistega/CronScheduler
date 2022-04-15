package com.tegaistega.scheduling;

import com.tegaistega.scheduling.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SchedulingApplication {

    public static void main(String[] args){
        SpringApplication.run(SchedulingApplication.class, args);

    }

}
