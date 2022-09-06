package com.vitorl.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeRepository getRepository() {
        return repository;
    }

    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("A", "B", "ab"));
        this.repository.save(new Employee("C", "D", "cd"));
        this.repository.save(new Employee("E", "F", "EF"));
    }

}
