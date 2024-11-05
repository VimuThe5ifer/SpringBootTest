package com.vimuthe5ifer.springTest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vimuthe5ifer.springTest.model.employee;

public interface EmployeeRepo extends JpaRepository<employee, Integer>{



}
