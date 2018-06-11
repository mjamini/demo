/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author jmohanta
 */
@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
            this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
            this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }    
}
