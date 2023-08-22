package com.stg.brianb.stgbootrestcert.repository;

import com.stg.brianb.stgbootrestcert.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
