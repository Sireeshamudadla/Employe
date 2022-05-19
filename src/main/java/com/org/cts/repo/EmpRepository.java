package com.org.cts.repo;

import com.org.cts.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {

    @Transactional
    String deleteByAddress(String address);
}
