package com.MyLearning.LearningProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyLearning.LearningProject.model.Employee;
@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
