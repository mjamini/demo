package com.example.demo.payroll;


import com.example.demo.payroll.Employee;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author jmohanta
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    
}
