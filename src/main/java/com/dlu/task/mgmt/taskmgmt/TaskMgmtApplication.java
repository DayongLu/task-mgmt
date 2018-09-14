package com.dlu.task.mgmt.taskmgmt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class TaskMgmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskMgmtApplication.class, args);
    }

    @Bean
    CommandLineRunner initialize(TaskRepository taskRepository, FYearRepository fYearRepository, FQuatorRepository fQuatorRepository, FWeekRepository fWeekRepository) {
        return args -> {
            Stream.of("Channel Activities", "DellEMC Internal Meeting", "HE Account Plan", "Lapsed Accounts Visit", "Hybrid Cloud", "Marketing Event", "MDC Internal Meeting").forEach(name -> {
                taskRepository.save( new Task(name));
            });

            Stream.of("FY18","FY19","FY20").forEach(fy -> {
                fYearRepository.save(new FYear(fy) );
            });

            Stream.of("Q1","Q2","Q3","Q4").forEach(fy -> {
                fQuatorRepository.save(new FQuator(fy) );
            });
            Stream.of("W1","W2","W3","W4","W5","W6","W7","W8").forEach(fy -> {
                fWeekRepository.save(new FWeek(fy) );
            });
        };
    }
}
